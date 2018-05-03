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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get information about a collection of <a>BasePathMapping</a> resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBasePathMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The domain name of a <a>BasePathMapping</a> resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * [Required] The domain name of a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param domainName
     *        [Required] The domain name of a <a>BasePathMapping</a> resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * [Required] The domain name of a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @return [Required] The domain name of a <a>BasePathMapping</a> resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * [Required] The domain name of a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param domainName
     *        [Required] The domain name of a <a>BasePathMapping</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @return The current pagination position in the paged result set.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingsRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @return The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBasePathMappingsRequest == false)
            return false;
        GetBasePathMappingsRequest other = (GetBasePathMappingsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetBasePathMappingsRequest clone() {
        return (GetBasePathMappingsRequest) super.clone();
    }

}
