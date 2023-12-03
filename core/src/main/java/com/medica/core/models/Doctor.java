package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Doctor {

    @ValueMapValue
    private String doctorName;

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String doctorDescription;

    public String getDoctorName() {
        return doctorName;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getDoctorDescription() {
        return doctorDescription;
    }
}
