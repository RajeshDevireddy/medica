package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MobileLinksModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String iosLinkText;

    @ValueMapValue
    private String iosLink;

    @ValueMapValue
    private String iosIcon;

    @ValueMapValue
    private String androidLinkText;

    @ValueMapValue
    private String androidLink;

    @ValueMapValue
    private String androidIcon;

    public String getTitle() {
        return title;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getIosLinkText() {
        return iosLinkText;
    }

    public String getIosLink() {
        return iosLink;
    }

    public String getIosIcon() {
        return iosIcon;
    }

    public String getAndroidLinkText() {
        return androidLinkText;
    }

    public String getAndroidLink() {
        return androidLink;
    }

    public String getAndroidIcon() {
        return androidIcon;
    }
}
