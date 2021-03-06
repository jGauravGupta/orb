/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.corba.ee.impl.orb ;

import com.sun.corba.ee.spi.orb.ObjectKeyCacheEntry ;

import com.sun.corba.ee.spi.ior.ObjectKey ;

import com.sun.corba.ee.spi.oa.ObjectAdapter ;

public abstract class ObjectKeyCacheEntryBase implements ObjectKeyCacheEntry {
    private ObjectKey okey ;

    public ObjectKeyCacheEntryBase( ObjectKey okey ) {
        this.okey = okey ;
    }

    public ObjectKey getObjectKey() {
        return okey ;
    }
}

