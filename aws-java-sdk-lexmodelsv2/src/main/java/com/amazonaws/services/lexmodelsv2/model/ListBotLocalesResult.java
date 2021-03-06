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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotLocales" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotLocalesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to list locales for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotLocales</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotLocales</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Summary information for the locales that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter of the request. If there are more locales available,
     * the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<BotLocaleSummary> botLocaleSummaries;

    /**
     * <p>
     * The identifier of the bot to list locales for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to list locales for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to list locales for.
     * </p>
     * 
     * @return The identifier of the bot to list locales for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to list locales for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to list locales for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotLocalesResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @return The version of the bot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotLocalesResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotLocales</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotLocales</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBotLocales</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotLocales</code> operation request to get
     *        the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotLocales</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotLocales</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListBotLocales</code> operation. If the <code>nextToken</code> field is present, you send the
     *         contents as the <code>nextToken</code> parameter of a <code>ListBotLocales</code> operation request to
     *         get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotLocales</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotLocales</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBotLocales</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotLocales</code> operation request to get
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotLocalesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Summary information for the locales that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter of the request. If there are more locales available,
     * the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the locales that meet the filter criteria specified in the request. The length of
     *         the list is specified in the <code>maxResults</code> parameter of the request. If there are more locales
     *         available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public java.util.List<BotLocaleSummary> getBotLocaleSummaries() {
        return botLocaleSummaries;
    }

    /**
     * <p>
     * Summary information for the locales that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter of the request. If there are more locales available,
     * the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param botLocaleSummaries
     *        Summary information for the locales that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more locales
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setBotLocaleSummaries(java.util.Collection<BotLocaleSummary> botLocaleSummaries) {
        if (botLocaleSummaries == null) {
            this.botLocaleSummaries = null;
            return;
        }

        this.botLocaleSummaries = new java.util.ArrayList<BotLocaleSummary>(botLocaleSummaries);
    }

    /**
     * <p>
     * Summary information for the locales that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter of the request. If there are more locales available,
     * the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotLocaleSummaries(java.util.Collection)} or {@link #withBotLocaleSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param botLocaleSummaries
     *        Summary information for the locales that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more locales
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotLocalesResult withBotLocaleSummaries(BotLocaleSummary... botLocaleSummaries) {
        if (this.botLocaleSummaries == null) {
            setBotLocaleSummaries(new java.util.ArrayList<BotLocaleSummary>(botLocaleSummaries.length));
        }
        for (BotLocaleSummary ele : botLocaleSummaries) {
            this.botLocaleSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the locales that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter of the request. If there are more locales available,
     * the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param botLocaleSummaries
     *        Summary information for the locales that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more locales
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotLocalesResult withBotLocaleSummaries(java.util.Collection<BotLocaleSummary> botLocaleSummaries) {
        setBotLocaleSummaries(botLocaleSummaries);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBotLocaleSummaries() != null)
            sb.append("BotLocaleSummaries: ").append(getBotLocaleSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotLocalesResult == false)
            return false;
        ListBotLocalesResult other = (ListBotLocalesResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBotLocaleSummaries() == null ^ this.getBotLocaleSummaries() == null)
            return false;
        if (other.getBotLocaleSummaries() != null && other.getBotLocaleSummaries().equals(this.getBotLocaleSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleSummaries() == null) ? 0 : getBotLocaleSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListBotLocalesResult clone() {
        try {
            return (ListBotLocalesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
