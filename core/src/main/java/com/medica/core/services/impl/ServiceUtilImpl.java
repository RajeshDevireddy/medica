package com.medica.core.services.impl;

import com.medica.core.services.ServiceUtil;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@Component(service = ServiceUtil.class,immediate = true)
public class ServiceUtilImpl implements ServiceUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceUtilImpl.class);

    @Reference
    ResourceResolverFactory resolverFactory;
    @Override
    public ResourceResolver getResourceResolver() {
        ResourceResolver resolver = null;
        Map<String, Object> params = getServiceParams();
        try {
            resolver = resolverFactory.getServiceResourceResolver(params);
        } catch (LoginException e) {
            LOG.error("Error getting resource resolver", e);
        }
        return resolver;
    }

    private Map<String, Object> getServiceParams() {
        Map<String, Object> params = new HashMap<>();
        params.put(ResourceResolverFactory.SUBSERVICE, "medica-system-user");
        return params;
    }

}
