/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.Route;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.RouteUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourceReference;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDEndpointProtocols;
import com.microsoft.azure.management.cdn.v2020_09_01.QueryStringCachingBehavior;
import com.microsoft.azure.management.cdn.v2020_09_01.OptimizationType;
import com.microsoft.azure.management.cdn.v2020_09_01.ForwardingProtocol;
import com.microsoft.azure.management.cdn.v2020_09_01.LinkToDefaultDomain;
import com.microsoft.azure.management.cdn.v2020_09_01.HttpsRedirect;
import com.microsoft.azure.management.cdn.v2020_09_01.EnabledState;
import com.microsoft.azure.management.cdn.v2020_09_01.AfdProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.DeploymentStatus;
import rx.functions.Func1;

class RouteImpl extends CreatableUpdatableImpl<Route, RouteInner, RouteImpl> implements Route, Route.Definition, Route.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String endpointName;
    private String routeName;
    private RouteUpdateParameters updateParameter;

    RouteImpl(String name, CdnManager manager) {
        super(name, new RouteInner());
        this.manager = manager;
        // Set resource name
        this.routeName = name;
        //
        this.updateParameter = new RouteUpdateParameters();
    }

    RouteImpl(RouteInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.routeName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.endpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "afdEndpoints");
        this.routeName = IdParsingUtils.getValueFromIdByName(inner.id(), "routes");
        //
        this.updateParameter = new RouteUpdateParameters();
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Route> createResourceAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.createAsync(this.resourceGroupName, this.profileName, this.endpointName, this.routeName, this.inner())
            .map(new Func1<RouteInner, RouteInner>() {
               @Override
               public RouteInner call(RouteInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Route> updateResourceAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.endpointName, this.routeName, this.updateParameter)
            .map(new Func1<RouteInner, RouteInner>() {
               @Override
               public RouteInner call(RouteInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RouteInner> getInnerAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.getAsync(this.resourceGroupName, this.profileName, this.endpointName, this.routeName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new RouteUpdateParameters();
    }

    @Override
    public Object compressionSettings() {
        return this.inner().compressionSettings();
    }

    @Override
    public List<ResourceReference> customDomains() {
        return this.inner().customDomains();
    }

    @Override
    public DeploymentStatus deploymentStatus() {
        return this.inner().deploymentStatus();
    }

    @Override
    public EnabledState enabledState() {
        return this.inner().enabledState();
    }

    @Override
    public ForwardingProtocol forwardingProtocol() {
        return this.inner().forwardingProtocol();
    }

    @Override
    public HttpsRedirect httpsRedirect() {
        return this.inner().httpsRedirect();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public LinkToDefaultDomain linkToDefaultDomain() {
        return this.inner().linkToDefaultDomain();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OptimizationType optimizationType() {
        return this.inner().optimizationType();
    }

    @Override
    public ResourceReference originGroup() {
        return this.inner().originGroup();
    }

    @Override
    public String originPath() {
        return this.inner().originPath();
    }

    @Override
    public List<String> patternsToMatch() {
        return this.inner().patternsToMatch();
    }

    @Override
    public AfdProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public QueryStringCachingBehavior queryStringCachingBehavior() {
        return this.inner().queryStringCachingBehavior();
    }

    @Override
    public List<ResourceReference> ruleSets() {
        return this.inner().ruleSets();
    }

    @Override
    public List<AFDEndpointProtocols> supportedProtocols() {
        return this.inner().supportedProtocols();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RouteImpl withExistingAfdEndpoint(String resourceGroupName, String profileName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.endpointName = endpointName;
        return this;
    }

    @Override
    public RouteImpl withOriginGroup(ResourceReference originGroup) {
        if (isInCreateMode()) {
            this.inner().withOriginGroup(originGroup);
        } else {
            this.updateParameter.withOriginGroup(originGroup);
        }
        return this;
    }

    @Override
    public RouteImpl withCompressionSettings(Object compressionSettings) {
        if (isInCreateMode()) {
            this.inner().withCompressionSettings(compressionSettings);
        } else {
            this.updateParameter.withCompressionSettings(compressionSettings);
        }
        return this;
    }

    @Override
    public RouteImpl withCustomDomains(List<ResourceReference> customDomains) {
        if (isInCreateMode()) {
            this.inner().withCustomDomains(customDomains);
        } else {
            this.updateParameter.withCustomDomains(customDomains);
        }
        return this;
    }

    @Override
    public RouteImpl withEnabledState(EnabledState enabledState) {
        if (isInCreateMode()) {
            this.inner().withEnabledState(enabledState);
        } else {
            this.updateParameter.withEnabledState(enabledState);
        }
        return this;
    }

    @Override
    public RouteImpl withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
        if (isInCreateMode()) {
            this.inner().withForwardingProtocol(forwardingProtocol);
        } else {
            this.updateParameter.withForwardingProtocol(forwardingProtocol);
        }
        return this;
    }

    @Override
    public RouteImpl withHttpsRedirect(HttpsRedirect httpsRedirect) {
        if (isInCreateMode()) {
            this.inner().withHttpsRedirect(httpsRedirect);
        } else {
            this.updateParameter.withHttpsRedirect(httpsRedirect);
        }
        return this;
    }

    @Override
    public RouteImpl withLinkToDefaultDomain(LinkToDefaultDomain linkToDefaultDomain) {
        if (isInCreateMode()) {
            this.inner().withLinkToDefaultDomain(linkToDefaultDomain);
        } else {
            this.updateParameter.withLinkToDefaultDomain(linkToDefaultDomain);
        }
        return this;
    }

    @Override
    public RouteImpl withOptimizationType(OptimizationType optimizationType) {
        if (isInCreateMode()) {
            this.inner().withOptimizationType(optimizationType);
        } else {
            this.updateParameter.withOptimizationType(optimizationType);
        }
        return this;
    }

    @Override
    public RouteImpl withOriginPath(String originPath) {
        if (isInCreateMode()) {
            this.inner().withOriginPath(originPath);
        } else {
            this.updateParameter.withOriginPath(originPath);
        }
        return this;
    }

    @Override
    public RouteImpl withPatternsToMatch(List<String> patternsToMatch) {
        if (isInCreateMode()) {
            this.inner().withPatternsToMatch(patternsToMatch);
        } else {
            this.updateParameter.withPatternsToMatch(patternsToMatch);
        }
        return this;
    }

    @Override
    public RouteImpl withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        if (isInCreateMode()) {
            this.inner().withQueryStringCachingBehavior(queryStringCachingBehavior);
        } else {
            this.updateParameter.withQueryStringCachingBehavior(queryStringCachingBehavior);
        }
        return this;
    }

    @Override
    public RouteImpl withRuleSets(List<ResourceReference> ruleSets) {
        if (isInCreateMode()) {
            this.inner().withRuleSets(ruleSets);
        } else {
            this.updateParameter.withRuleSets(ruleSets);
        }
        return this;
    }

    @Override
    public RouteImpl withSupportedProtocols(List<AFDEndpointProtocols> supportedProtocols) {
        if (isInCreateMode()) {
            this.inner().withSupportedProtocols(supportedProtocols);
        } else {
            this.updateParameter.withSupportedProtocols(supportedProtocols);
        }
        return this;
    }

}