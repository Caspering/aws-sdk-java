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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListContexts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContextsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only contexts with the specified source URI.
     * </p>
     */
    private String sourceUri;
    /**
     * <p>
     * A filter that returns only contexts of the specified type.
     * </p>
     */
    private String contextType;
    /**
     * <p>
     * A filter that returns only contexts created on or after the specified time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A filter that returns only contexts created on or before the specified time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns a
     * token for getting the next set of contexts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of contexts to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter that returns only contexts with the specified source URI.
     * </p>
     * 
     * @param sourceUri
     *        A filter that returns only contexts with the specified source URI.
     */

    public void setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
    }

    /**
     * <p>
     * A filter that returns only contexts with the specified source URI.
     * </p>
     * 
     * @return A filter that returns only contexts with the specified source URI.
     */

    public String getSourceUri() {
        return this.sourceUri;
    }

    /**
     * <p>
     * A filter that returns only contexts with the specified source URI.
     * </p>
     * 
     * @param sourceUri
     *        A filter that returns only contexts with the specified source URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withSourceUri(String sourceUri) {
        setSourceUri(sourceUri);
        return this;
    }

    /**
     * <p>
     * A filter that returns only contexts of the specified type.
     * </p>
     * 
     * @param contextType
     *        A filter that returns only contexts of the specified type.
     */

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    /**
     * <p>
     * A filter that returns only contexts of the specified type.
     * </p>
     * 
     * @return A filter that returns only contexts of the specified type.
     */

    public String getContextType() {
        return this.contextType;
    }

    /**
     * <p>
     * A filter that returns only contexts of the specified type.
     * </p>
     * 
     * @param contextType
     *        A filter that returns only contexts of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withContextType(String contextType) {
        setContextType(contextType);
        return this;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only contexts created on or after the specified time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only contexts created on or after the specified time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only contexts created on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only contexts created on or before the specified time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only contexts created on or before the specified time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that returns only contexts created on or before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only contexts created on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @see SortContextsBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @return The property used to sort results. The default value is <code>CreationTime</code>.
     * @see SortContextsBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortContextsBy
     */

    public ListContextsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortContextsBy
     */

    public ListContextsRequest withSortBy(SortContextsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @return The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListContextsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListContextsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns a
     * token for getting the next set of contexts.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns
     *        a token for getting the next set of contexts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns a
     * token for getting the next set of contexts.
     * </p>
     * 
     * @return If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call
     *         returns a token for getting the next set of contexts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns a
     * token for getting the next set of contexts.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListContexts</code> didn't return the full set of contexts, the call returns
     *        a token for getting the next set of contexts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of contexts to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of contexts to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of contexts to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of contexts to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of contexts to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of contexts to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContextsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSourceUri() != null)
            sb.append("SourceUri: ").append(getSourceUri()).append(",");
        if (getContextType() != null)
            sb.append("ContextType: ").append(getContextType()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContextsRequest == false)
            return false;
        ListContextsRequest other = (ListContextsRequest) obj;
        if (other.getSourceUri() == null ^ this.getSourceUri() == null)
            return false;
        if (other.getSourceUri() != null && other.getSourceUri().equals(this.getSourceUri()) == false)
            return false;
        if (other.getContextType() == null ^ this.getContextType() == null)
            return false;
        if (other.getContextType() != null && other.getContextType().equals(this.getContextType()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceUri() == null) ? 0 : getSourceUri().hashCode());
        hashCode = prime * hashCode + ((getContextType() == null) ? 0 : getContextType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListContextsRequest clone() {
        return (ListContextsRequest) super.clone();
    }

}
