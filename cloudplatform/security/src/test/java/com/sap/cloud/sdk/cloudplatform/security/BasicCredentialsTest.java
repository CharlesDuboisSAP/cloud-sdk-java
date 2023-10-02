/*
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.cloud.sdk.cloudplatform.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BasicCredentialsTest
{

    @Test
    public void testHttpHeaderValue()
    {
        assertThat(new BasicCredentials("user", "pass").getHttpHeaderValue()).isEqualTo("Basic dXNlcjpwYXNz");
    }
}
