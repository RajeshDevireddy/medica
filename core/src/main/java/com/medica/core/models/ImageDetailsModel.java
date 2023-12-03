package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageDetailsModel {
    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String imageAlignment;

    @ValueMapValue
    private String caption;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String link;

    @ValueMapValue
    private String linkText;

    @ValueMapValue
    private String buttonStyle;

    public String getCaption() {
        return caption;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getLinkText() {
        return linkText;
    }

    public String getButtonStyle() {
        return buttonStyle;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getImageAlignment() {
        return imageAlignment;
    }

}
