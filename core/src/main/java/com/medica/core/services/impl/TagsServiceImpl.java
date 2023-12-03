package com.medica.core.services.impl;

import com.day.cq.tagging.Tag;
import com.medica.core.services.ServiceUtil;
import com.medica.core.services.TagsService;
import com.medica.core.services.config.TagsServiceConfig;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@Component(service = TagsService.class,immediate = true)
@Designate(ocd = TagsServiceConfig.class)
public class TagsServiceImpl implements TagsService{
    private static final Logger LOG = LoggerFactory.getLogger(TagsServiceImpl.class);
    TagsServiceConfig config;

    @Reference
    private ServiceUtil serviceUtil;
    @Activate
    protected void activate(TagsServiceConfig config) {
        this.config = config;
    }

    @Override
    public List<Map<String, String>> getTags() {
        List<Map<String, String>> tagsList = new ArrayList<>();

        try (ResourceResolver resolver = serviceUtil.getResourceResolver()) {
            String tagsPath = config.tagsPath();
            if (resolver != null) {
                LOG.debug("User {}", resolver.getUserID());
                Resource tagsService = resolver.getResource(tagsPath);
                LOG.debug("tagsService {}", tagsService);
                if (tagsService != null) {
                    Iterable<Resource> tags = tagsService.getChildren();
                    Iterator<Resource> iterator = tags.iterator();
                    int index = 0;
                    Map<String, String> tagMap = new HashMap<>();

                    while (iterator.hasNext()) {
                        Resource tag = iterator.next();
                        Tag item = tag.adaptTo(Tag.class);
                        tagMap.put(item.getTitle(), item.getName());
                        index++;

                        if (index == 5 || !iterator.hasNext()) {
                            tagsList.add(tagMap);
                            tagMap = new HashMap<>();
                            index = 0;
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOG.error("Error using resource resolver", e);
        }

        return tagsList;
    }


}
