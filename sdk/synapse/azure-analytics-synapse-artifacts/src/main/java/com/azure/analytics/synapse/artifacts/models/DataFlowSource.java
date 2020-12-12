// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Transformation for data flow source. */
@Fluent
public final class DataFlowSource extends Transformation {
    /*
     * Dataset reference.
     */
    @JsonProperty(value = "dataset")
    private DatasetReference dataset;

    /**
     * Get the dataset property: Dataset reference.
     *
     * @return the dataset value.
     */
    public DatasetReference getDataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Dataset reference.
     *
     * @param dataset the dataset value to set.
     * @return the DataFlowSource object itself.
     */
    public DataFlowSource setDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }
}