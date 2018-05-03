/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTagsRequestMarshaller implements Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    public Request<DeleteTagsRequest> marshall(DeleteTagsRequest deleteTagsRequest) {

        if (deleteTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(deleteTagsRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteTags");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> deleteTagsRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) deleteTagsRequest
                .getResources();
        if (!deleteTagsRequestResourcesList.isEmpty() || !deleteTagsRequestResourcesList.isAutoConstruct()) {
            int resourcesListIndex = 1;

            for (String deleteTagsRequestResourcesListValue : deleteTagsRequestResourcesList) {
                if (deleteTagsRequestResourcesListValue != null) {
                    request.addParameter("ResourceId." + resourcesListIndex, StringUtils.fromString(deleteTagsRequestResourcesListValue));
                }
                resourcesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> deleteTagsRequestTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) deleteTagsRequest.getTags();
        if (!deleteTagsRequestTagsList.isEmpty() || !deleteTagsRequestTagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag deleteTagsRequestTagsListValue : deleteTagsRequestTagsList) {

                if (deleteTagsRequestTagsListValue.getKey() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Key", StringUtils.fromString(deleteTagsRequestTagsListValue.getKey()));
                }

                if (deleteTagsRequestTagsListValue.getValue() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Value", StringUtils.fromString(deleteTagsRequestTagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
