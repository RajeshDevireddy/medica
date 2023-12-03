package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PracticeModel {
    @ValueMapValue
    private String specialityName;

    @ValueMapValue
    private String specialityDescription;

    @ValueMapValue
    private String readMoreLinkText;

    @ValueMapValue
    private String readMoreLink;

    public String getSpecialityName() {
        return specialityName;
    }

    public String getSpecialityDescription() {
        return specialityDescription;
    }

    public String getReadMoreLinkText() {
        return readMoreLinkText;
    }

    public String getReadMoreLink() {
        return readMoreLink;
    }
}
