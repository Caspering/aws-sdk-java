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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of port ranges for use in the rules in a rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PortSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of port ranges.
     * </p>
     */
    private java.util.List<String> definition;

    /**
     * <p>
     * The set of port ranges.
     * </p>
     * 
     * @return The set of port ranges.
     */

    public java.util.List<String> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * The set of port ranges.
     * </p>
     * 
     * @param definition
     *        The set of port ranges.
     */

    public void setDefinition(java.util.Collection<String> definition) {
        if (definition == null) {
            this.definition = null;
            return;
        }

        this.definition = new java.util.ArrayList<String>(definition);
    }

    /**
     * <p>
     * The set of port ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefinition(java.util.Collection)} or {@link #withDefinition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param definition
     *        The set of port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortSet withDefinition(String... definition) {
        if (this.definition == null) {
            setDefinition(new java.util.ArrayList<String>(definition.length));
        }
        for (String ele : definition) {
            this.definition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of port ranges.
     * </p>
     * 
     * @param definition
     *        The set of port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortSet withDefinition(java.util.Collection<String> definition) {
        setDefinition(definition);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortSet == false)
            return false;
        PortSet other = (PortSet) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public PortSet clone() {
        try {
            return (PortSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.PortSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
