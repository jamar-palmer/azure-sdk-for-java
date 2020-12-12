// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Informix linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Informix")
@JsonFlatten
@Fluent
public class InformixLinkedService extends LinkedService {
    /*
     * The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * Type of authentication used to connect to the Informix as ODBC data
     * store. Possible values are: Anonymous and Basic. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /*
     * The access credential portion of the connection string specified in
     * driver-specific property-value format.
     */
    @JsonProperty(value = "typeProperties.credential")
    private SecretBase credential;

    /*
     * User name for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password for Basic authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the Informix as ODBC data store.
     * Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the Informix as ODBC data store.
     * Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     *
     * @return the credential value.
     */
    public SecretBase getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     *
     * @param credential the credential value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setCredential(SecretBase credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the userName property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @param userName the userName value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password for Basic authentication.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for Basic authentication.
     *
     * @param password the password value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the InformixLinkedService object itself.
     */
    public InformixLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}