/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.Routes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_09_01.Route;

class RoutesImpl extends WrapperImpl<RoutesInner> implements Routes {
    private final CdnManager manager;

    RoutesImpl(CdnManager manager) {
        super(manager.inner().routes());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public RouteImpl define(String name) {
        return wrapModel(name);
    }

    private RouteImpl wrapModel(RouteInner inner) {
        return  new RouteImpl(inner, manager());
    }

    private RouteImpl wrapModel(String name) {
        return new RouteImpl(name, this.manager());
    }

    @Override
    public Observable<Route> listByEndpointAsync(final String resourceGroupName, final String profileName, final String endpointName) {
        RoutesInner client = this.inner();
        return client.listByEndpointAsync(resourceGroupName, profileName, endpointName)
        .flatMapIterable(new Func1<Page<RouteInner>, Iterable<RouteInner>>() {
            @Override
            public Iterable<RouteInner> call(Page<RouteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteInner, Route>() {
            @Override
            public Route call(RouteInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Route> getAsync(String resourceGroupName, String profileName, String endpointName, String routeName) {
        RoutesInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, endpointName, routeName)
        .flatMap(new Func1<RouteInner, Observable<Route>>() {
            @Override
            public Observable<Route> call(RouteInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Route)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String profileName, String endpointName, String routeName) {
        RoutesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, endpointName, routeName).toCompletable();
    }

}