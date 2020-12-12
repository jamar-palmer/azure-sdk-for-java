// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Request body structure for starting data flow debug session. */
@Fluent
public final class DataFlowDebugPackage {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Data flow instance.
     */
    @JsonProperty(value = "dataFlow")
    private DataFlowDebugResource dataFlow;

    /*
     * List of datasets.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetDebugResource> datasets;

    /*
     * List of linked services.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceDebugResource> linkedServices;

    /*
     * Staging info for debug session.
     */
    @JsonProperty(value = "staging")
    private DataFlowStagingInfo staging;

    /*
     * Data flow debug settings.
     */
    @JsonProperty(value = "debugSettings")
    private DataFlowDebugPackageDebugSettings debugSettings;

    /*
     * Request body structure for starting data flow debug session.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlow property: Data flow instance.
     *
     * @return the dataFlow value.
     */
    public DataFlowDebugResource getDataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow instance.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setDataFlow(DataFlowDebugResource dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the datasets property: List of datasets.
     *
     * @return the datasets value.
     */
    public List<DatasetDebugResource> getDatasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: List of datasets.
     *
     * @param datasets the datasets value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setDatasets(List<DatasetDebugResource> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceDebugResource> getLinkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: List of linked services.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setLinkedServices(List<LinkedServiceDebugResource> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the staging property: Staging info for debug session.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo getStaging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for debug session.
     *
     * @param staging the staging value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the debugSettings property: Data flow debug settings.
     *
     * @return the debugSettings value.
     */
    public DataFlowDebugPackageDebugSettings getDebugSettings() {
        return this.debugSettings;
    }

    /**
     * Set the debugSettings property: Data flow debug settings.
     *
     * @param debugSettings the debugSettings value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setDebugSettings(DataFlowDebugPackageDebugSettings debugSettings) {
        this.debugSettings = debugSettings;
        return this;
    }

    /**
     * Get the additionalProperties property: Request body structure for starting data flow debug session.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request body structure for starting data flow debug session.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}