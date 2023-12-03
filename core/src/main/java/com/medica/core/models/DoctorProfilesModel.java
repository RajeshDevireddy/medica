package com.medica.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DoctorProfilesModel {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String searchButtonName;

    @Inject
    List<Doctor> doctors;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSearchButtonName() {
        return searchButtonName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
