/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
package io.mifos.customer.util;

import io.mifos.customer.api.v1.domain.IdentificationCardScan;
import org.apache.commons.lang3.RandomStringUtils;

import javax.annotation.Nullable;

public class ScanGenerator {

  private ScanGenerator() {}

  public static IdentificationCardScan createRandomScan(@Nullable final String identifier) {
    final IdentificationCardScan scan = new IdentificationCardScan();

    if(identifier != null) {
      scan.setIdentifier(identifier);
    } else {
      scan.setIdentifier(RandomStringUtils.randomAlphanumeric(32));
    }

    scan.setDescription(RandomStringUtils.randomAlphanumeric(128));
    return scan;
  }
}
