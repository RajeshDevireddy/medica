package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeaturesModel {

    @ValueMapValue
    String featureLinkText;

    @ValueMapValue
    String featureLink;

    @ValueMapValue
    String featureDescription;

    @ValueMapValue
    String icon;


    public String getFeatureLinkText() {
        return featureLinkText;
    }

    public String getFeatureLink() {
        return featureLink;
    }

    public String getFeatureDescription() {
        return featureDescription;
    }

    public String getIcon() {
        return icon;
    }
}
