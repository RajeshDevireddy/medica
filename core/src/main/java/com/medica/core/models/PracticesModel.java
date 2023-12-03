package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PracticesModel {

    @ValueMapValue
    private String practiceTitle;

    @ValueMapValue
    private String practiceDescription;

    @ValueMapValue
    private String showMoreLinkText;

    @ValueMapValue
    private String showMoreLink;

    @Inject
    private List<PracticeModel> practices;


    public String getPracticeTitle() {
        return practiceTitle;
    }

    public String getPracticeDescription() {
        return practiceDescription;
    }

    public String getShowMoreLinkText() {
        return showMoreLinkText;
    }

    public String getShowMoreLink() {
        return showMoreLink;
    }

    public List<PracticeModel> getPractices() {
        return practices;
    }

}
