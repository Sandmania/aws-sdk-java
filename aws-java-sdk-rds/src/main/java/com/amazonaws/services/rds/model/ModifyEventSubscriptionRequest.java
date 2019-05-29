/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyEventSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEventSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are
     * returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories
     * for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     * 
     * @return The name of the RDS event notification subscription.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the RDS event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by
     *        Amazon SNS when you create a topic and subscribe to it.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by
     *         Amazon SNS when you create a topic and subscribe to it.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS
     * when you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by
     *        Amazon SNS when you create a topic and subscribe to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are
     * returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     * </p>
     * 
     * @param sourceType
     *        The type of source that is generating the events. For example, if you want to be notified of events
     *        generated by a DB instance, you would set this parameter to db-instance. if this value is not specified,
     *        all events are returned.</p>
     *        <p>
     *        Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are
     * returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     * </p>
     * 
     * @return The type of source that is generating the events. For example, if you want to be notified of events
     *         generated by a DB instance, you would set this parameter to db-instance. if this value is not specified,
     *         all events are returned.</p>
     *         <p>
     *         Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * a DB instance, you would set this parameter to db-instance. if this value is not specified, all events are
     * returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     * </p>
     * 
     * @param sourceType
     *        The type of source that is generating the events. For example, if you want to be notified of events
     *        generated by a DB instance, you would set this parameter to db-instance. if this value is not specified,
     *        all events are returned.</p>
     *        <p>
     *        Valid values: db-instance | db-parameter-group | db-security-group | db-snapshot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories
     * for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @return A list of event categories for a SourceType that you want to subscribe to. You can see a list of the
     *         categories for a given SourceType in the <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the
     *         <i>Amazon RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories
     * for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a SourceType that you want to subscribe to. You can see a list of the
     *        categories for a given SourceType in the <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the
     *        <i>Amazon RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories
     * for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a SourceType that you want to subscribe to. You can see a list of the
     *        categories for a given SourceType in the <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the
     *        <i>Amazon RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories
     * for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a SourceType that you want to subscribe to. You can see a list of the
     *        categories for a given SourceType in the <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the
     *        <i>Amazon RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     * 
     * @param enabled
     *        A value that indicates whether to activate the subscription.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     * 
     * @return A value that indicates whether to activate the subscription.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     * 
     * @param enabled
     *        A value that indicates whether to activate the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     * 
     * @return A value that indicates whether to activate the subscription.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEventSubscriptionRequest == false)
            return false;
        ModifyEventSubscriptionRequest other = (ModifyEventSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEventSubscriptionRequest clone() {
        return (ModifyEventSubscriptionRequest) super.clone();
    }

}
