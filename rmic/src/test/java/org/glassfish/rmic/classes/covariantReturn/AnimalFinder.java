/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.rmic.classes.covariantReturn;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AnimalFinder extends Remote {
    Animal getAnimalWithName(String name) throws RemoteException;

    Animal[][] getZooCages(int[][] sizes) throws RemoteException;

    double getValues(short a, long b, float c, double d)  throws RemoteException;
}
