// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data flow debug resource. */
@Fluent
public final class DataFlowDebugResource extends SubResourceDebugResource {
    /*
     * Data flow properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DataFlow properties;

    /**
     * Get the properties property: Data flow properties.
     *
     * @return the properties value.
     */
    public DataFlow getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Data flow properties.
     *
     * @param properties the properties value to set.
     * @return the DataFlowDebugResource object itself.
     */
    public DataFlowDebugResource setProperties(DataFlow properties) {
        this.properties = properties;
        return this;
    }
}