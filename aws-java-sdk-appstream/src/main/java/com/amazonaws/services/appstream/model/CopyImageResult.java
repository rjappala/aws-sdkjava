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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CopyImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the destination image.
     * </p>
     */
    private String destinationImageName;

    /**
     * <p>
     * The name of the destination image.
     * </p>
     * 
     * @param destinationImageName
     *        The name of the destination image.
     */

    public void setDestinationImageName(String destinationImageName) {
        this.destinationImageName = destinationImageName;
    }

    /**
     * <p>
     * The name of the destination image.
     * </p>
     * 
     * @return The name of the destination image.
     */

    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    /**
     * <p>
     * The name of the destination image.
     * </p>
     * 
     * @param destinationImageName
     *        The name of the destination image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageResult withDestinationImageName(String destinationImageName) {
        setDestinationImageName(destinationImageName);
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
        if (getDestinationImageName() != null)
            sb.append("DestinationImageName: ").append(getDestinationImageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageResult == false)
            return false;
        CopyImageResult other = (CopyImageResult) obj;
        if (other.getDestinationImageName() == null ^ this.getDestinationImageName() == null)
            return false;
        if (other.getDestinationImageName() != null && other.getDestinationImageName().equals(this.getDestinationImageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationImageName() == null) ? 0 : getDestinationImageName().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageResult clone() {
        try {
            return (CopyImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
