package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderLinksModel {

    public String getLinkText() {
        return linkText;
    }

    public String getLink() {
        return link;
    }

    @ValueMapValue
    String linkText;

    @ValueMapValue
    String link;
}
