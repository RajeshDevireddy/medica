package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ScheduleModel {

    @ValueMapValue
    private String scheduleTitle;

    @ValueMapValue
    private String scheduleDescription;

    @ValueMapValue
    private String inPersonLinkText;

    @ValueMapValue
    private String inPersonLink;

    @ValueMapValue
    private String virtualLinkText;

    @ValueMapValue
    private String virtuaLink;

    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public String getScheduleDescription() {
        return scheduleDescription;
    }

    public String getInPersonLinkText() {
        return inPersonLinkText;
    }

    public String getInPersonLink() {
        return inPersonLink;
    }

    public String getVirtualLinkText() {
        return virtualLinkText;
    }

    public String getVirtuaLink() {
        return virtuaLink;
    }
}
