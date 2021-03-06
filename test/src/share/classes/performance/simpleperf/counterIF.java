/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package performance.simpleperf;

import java.rmi.Remote ;
import java.rmi.RemoteException ;

public interface counterIF extends java.rmi.Remote {
    public long increment( long invalue ) throws java.rmi.RemoteException ;
}
