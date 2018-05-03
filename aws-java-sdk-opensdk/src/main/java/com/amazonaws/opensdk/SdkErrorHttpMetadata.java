/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.opensdk;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.http.SdkHttpMetadata;

import java.nio.ByteBuffer;
import java.util.Optional;

import static com.amazonaws.opensdk.SdkResponseMetadata.HEADER_REQUEST_ID;

/**
 * Metadata about the HTTP error response. Also includes the raw body content for debugging.
 */
@Immutable
public class SdkErrorHttpMetadata {

    private final ByteBuffer responseContent;

    private final SdkHttpMetadata httpMetadata;

    public SdkErrorHttpMetadata(SdkHttpMetadata httpMetadata,
                                byte[] responseContent) {
        this.httpMetadata = httpMetadata;
        this.responseContent = ByteBuffer.wrap(responseContent).asReadOnlyBuffer();
    }

    /**
     * Get a specific header from the error response.
     *
     * @param headerName Header to retrieve.
     * @return Optional of header value.
     */
    public Optional<String> header(String headerName) {
        return Optional.ofNullable(httpMetadata.getHttpHeaders().get(headerName));
    }

    /**
     * @return x-amzn-RequestId generated by the API Gateway frontend. Uniquely identifies a request
     * and can be used for troubleshooting server side issues.
     */
    public String requestId() {
        return httpMetadata.getHttpHeaders().get(HEADER_REQUEST_ID);
    }

    /**
     * @return HTTP status code of response.
     */
    public int httpStatusCode() {
        return httpMetadata.getHttpStatusCode();
    }

    /**
     * @return Response content as a {@link ByteBuffer}.
     */
    public ByteBuffer responseContent() {
        return responseContent;
    }

}
