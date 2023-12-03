package com.medica.core.services.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Tags Service Configuration",description = "Enter Tags service configuration details here")
public @interface TagsServiceConfig {
    @AttributeDefinition(
            name = "Tags path",
            description = "Enter Tags path")
    String tagsPath();
}
