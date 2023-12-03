package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroModel {

    @ValueMapValue
    String image;
    
    @ValueMapValue
    String title;

    @ValueMapValue
    String description;

    @ValueMapValue
    String appointmentLinktext;

    @ValueMapValue
    String appointmentLink;

    @ValueMapValue
    String appointmentButtonIcon;

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAppointmentLinktext() {
        return appointmentLinktext;
    }

    public String getAppointmentLink() {
        return appointmentLink;
    }

    public String getAppointmentButtonIcon() {
        return appointmentButtonIcon;
    }


}
