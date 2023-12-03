package com.medica.core.models;

import com.medica.core.services.TagsService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SearchModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String caption;

    @ValueMapValue
    private String symptomTitle;

    @ValueMapValue
    private String symptomDescription;

    @OSGiService
    private TagsService tagsService;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Map<String, String>> getTags() {
        return tagsService.getTags();
    }

    public String getSymptomTitle() {
        return symptomTitle;
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }

    public Map<String,Character> getSearchLetters() {
        Map<String,Character> map = new HashMap<>();
        for (char ch = 'A'; ch <= 'Z'; ++ch)
            map.put(String.valueOf(ch), ch);
        return map;
    }
}
