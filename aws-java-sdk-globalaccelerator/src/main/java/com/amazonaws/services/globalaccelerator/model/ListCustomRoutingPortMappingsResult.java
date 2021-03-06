/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomRoutingPortMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The port mappings for a custom routing accelerator.
     * </p>
     */
    private java.util.List<PortMapping> portMappings;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The port mappings for a custom routing accelerator.
     * </p>
     * 
     * @return The port mappings for a custom routing accelerator.
     */

    public java.util.List<PortMapping> getPortMappings() {
        return portMappings;
    }

    /**
     * <p>
     * The port mappings for a custom routing accelerator.
     * </p>
     * 
     * @param portMappings
     *        The port mappings for a custom routing accelerator.
     */

    public void setPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
            return;
        }

        this.portMappings = new java.util.ArrayList<PortMapping>(portMappings);
    }

    /**
     * <p>
     * The port mappings for a custom routing accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortMappings(java.util.Collection)} or {@link #withPortMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portMappings
     *        The port mappings for a custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsResult withPortMappings(PortMapping... portMappings) {
        if (this.portMappings == null) {
            setPortMappings(new java.util.ArrayList<PortMapping>(portMappings.length));
        }
        for (PortMapping ele : portMappings) {
            this.portMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The port mappings for a custom routing accelerator.
     * </p>
     * 
     * @param portMappings
     *        The port mappings for a custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsResult withPortMappings(java.util.Collection<PortMapping> portMappings) {
        setPortMappings(portMappings);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPortMappings() != null)
            sb.append("PortMappings: ").append(getPortMappings()).append(",");
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

        if (obj instanceof ListCustomRoutingPortMappingsResult == false)
            return false;
        ListCustomRoutingPortMappingsResult other = (ListCustomRoutingPortMappingsResult) obj;
        if (other.getPortMappings() == null ^ this.getPortMappings() == null)
            return false;
        if (other.getPortMappings() != null && other.getPortMappings().equals(this.getPortMappings()) == false)
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

        hashCode = prime * hashCode + ((getPortMappings() == null) ? 0 : getPortMappings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomRoutingPortMappingsResult clone() {
        try {
            return (ListCustomRoutingPortMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
