// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.DataConnectionsClient;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.DataConnection;
import com.azure.resourcemanager.kusto.models.DataConnectionCheckNameRequest;
import com.azure.resourcemanager.kusto.models.DataConnectionValidationListResult;
import com.azure.resourcemanager.kusto.models.DataConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataConnectionsImpl implements DataConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataConnectionsImpl.class);

    private final DataConnectionsClient innerClient;

    private final KustoManager serviceManager;

    public DataConnectionsImpl(DataConnectionsClient innerClient, KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataConnection> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName) {
        PagedIterable<DataConnectionInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, clusterName, databaseName);
        return inner.mapPage(inner1 -> new DataConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<DataConnection> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        PagedIterable<DataConnectionInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, clusterName, databaseName, context);
        return inner.mapPage(inner1 -> new DataConnectionImpl(inner1, this.manager()));
    }

    public DataConnectionValidationListResult dataConnectionValidation(
        String resourceGroupName, String clusterName, String databaseName, DataConnectionValidationInner parameters) {
        DataConnectionValidationListResultInner inner =
            this.serviceClient().dataConnectionValidation(resourceGroupName, clusterName, databaseName, parameters);
        if (inner != null) {
            return new DataConnectionValidationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataConnectionValidationListResult dataConnectionValidation(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionValidationInner parameters,
        Context context) {
        DataConnectionValidationListResultInner inner =
            this
                .serviceClient()
                .dataConnectionValidation(resourceGroupName, clusterName, databaseName, parameters, context);
        if (inner != null) {
            return new DataConnectionValidationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CheckNameResult checkNameAvailability(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName) {
        CheckNameResultInner inner =
            this
                .serviceClient()
                .checkNameAvailability(resourceGroupName, clusterName, databaseName, dataConnectionName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName,
        Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    resourceGroupName, clusterName, databaseName, dataConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataConnection get(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName) {
        DataConnectionInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, databaseName, dataConnectionName);
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataConnection> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context) {
        Response<DataConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, clusterName, databaseName, dataConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataConnection createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters) {
        DataConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, clusterName, databaseName, dataConnectionName, parameters);
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataConnection createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context) {
        DataConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, clusterName, databaseName, dataConnectionName, parameters, context);
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataConnection update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters) {
        DataConnectionInner inner =
            this.serviceClient().update(resourceGroupName, clusterName, databaseName, dataConnectionName, parameters);
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataConnection update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context) {
        DataConnectionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, clusterName, databaseName, dataConnectionName, parameters, context);
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, dataConnectionName);
    }

    public void delete(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, dataConnectionName, context);
    }

    private DataConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private KustoManager manager() {
        return this.serviceManager;
    }
}