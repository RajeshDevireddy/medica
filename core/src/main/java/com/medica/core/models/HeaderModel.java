package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {

    @ValueMapValue
    String logo;
    @ValueMapValue
    String mobileNumber;

    @ValueMapValue
    String appointmentLinkText;

    @ValueMapValue
    String appointmentLink;

    @Inject
    private List<HeaderLinksModel> header;


    public String getLogo() {
        return logo;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAppointmentLinkText() {
        return appointmentLinkText;
    }

    public String getAppointmentLink() {
        return appointmentLink;
    }

    public List<HeaderLinksModel> getHeader() {
        return header;
    }
}
