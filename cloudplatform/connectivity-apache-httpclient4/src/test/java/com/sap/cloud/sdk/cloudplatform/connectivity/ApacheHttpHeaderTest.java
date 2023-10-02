/*
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.cloud.sdk.cloudplatform.connectivity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ApacheHttpHeaderTest
{
    @Test
    public void testToString()
    {
        final Header header = new Header("key", "value");

        final HttpClientWrapper.ApacheHttpHeader apacheHttpHeader = new HttpClientWrapper.ApacheHttpHeader(header);

        assertThat(apacheHttpHeader.toString()).isEqualTo("ApacheHttpHeader(header=Header(name=key, value=(hidden)))");
    }
}
