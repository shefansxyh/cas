/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.adaptors.x509.authentication.handler.support;

import java.security.GeneralSecurityException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Implements an unqualified allow policy.
 *
 * @author Marvin S. Addison
 * @version $Revision$
 * @since 3.4.6
 *
 */
public final class AllowRevocationPolicy implements RevocationPolicy<Void> {
    /** Logger instance */
    private final Log log = LogFactory.getLog(getClass());


    /**
     * Policy application does nothing to implement unqualfied allow.
     *
     * @param data SHOULD be null; ignored in all cases.
     * 
     * @throws GeneralSecurityException Never thrown.
     *
     * @see org.jasig.cas.adaptors.x509.authentication.handler.support.RevocationPolicy#apply(java.lang.Object)
     */
    public void apply(final Void data) throws GeneralSecurityException {
        log.info("Continuing since AllowRevocationPolicy is in effect.");
    }
}
