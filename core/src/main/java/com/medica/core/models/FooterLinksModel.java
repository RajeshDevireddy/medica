package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterLinksModel {

    @ValueMapValue
    String sectionName;

    @Inject
    private List<FooterLinksNestedModel> footerLinks;

    public String getSectionName() {
        return sectionName;
    }

    public List<FooterLinksNestedModel> getFooterLinks() {
        return footerLinks;
    }

}
