package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel {

    @Inject
    private List<FooterLinksModel> footer;

    @ValueMapValue
    private String logo;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String linkedIn;

    @ValueMapValue
    private String instagram;

    @ValueMapValue
    private String twitter;

    public List<FooterLinksModel> getFooter() {
        return footer;
    }

    public String getLogo() {
        return logo;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getTwitter() {
        return twitter;
    }
}
