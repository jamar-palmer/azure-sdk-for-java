/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation.DigitalTwinsManager;
import java.util.List;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<DigitalTwinsManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    PrivateEndpointConnectionProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PrivateEndpointConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDigitalTwinsInstance, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateEndpointConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateEndpointConnection definition.
         */
        interface Blank extends WithDigitalTwinsInstance {
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify DigitalTwinsInstance.
         */
        interface WithDigitalTwinsInstance {
           /**
            * Specifies resourceGroupName, resourceName.
            * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance
            * @param resourceName The name of the DigitalTwinsInstance
            * @return the next definition stage
            */
            WithProperties withExistingDigitalTwinsInstance(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties the properties parameter value
            * @return the next definition stage
            */
            WithCreate withProperties(PrivateEndpointConnectionProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateEndpointConnection> {
        }
    }
    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpointconnection update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next update stage
             */
            Update withProperties(PrivateEndpointConnectionProperties properties);
        }

    }
}