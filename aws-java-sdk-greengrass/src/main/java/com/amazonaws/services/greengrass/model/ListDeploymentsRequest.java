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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the AWS Greengrass group. */
    private String groupId;
    /** The maximum number of results to be returned per request. */
    private String maxResults;
    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;

    /**
     * The ID of the AWS Greengrass group.
     * 
     * @param groupId
     *        The ID of the AWS Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the AWS Greengrass group.
     * 
     * @return The ID of the AWS Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the AWS Greengrass group.
     * 
     * @param groupId
     *        The ID of the AWS Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * The maximum number of results to be returned per request.
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to be returned per request.
     * 
     * @return The maximum number of results to be returned per request.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to be returned per request.
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withMaxResults(String maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentsRequest == false)
            return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentsRequest clone() {
        return (ListDeploymentsRequest) super.clone();
    }

}
