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
package com.amazonaws.services.xray.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InsightMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightMarshaller {

    private static final MarshallingInfo<String> INSIGHTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InsightId").build();
    private static final MarshallingInfo<String> GROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupARN").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<StructuredPojo> ROOTCAUSESERVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootCauseServiceId").build();
    private static final MarshallingInfo<List> CATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Categories").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Summary").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTREQUESTIMPACTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestImpactStatistics").build();
    private static final MarshallingInfo<StructuredPojo> ROOTCAUSESERVICEREQUESTIMPACTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootCauseServiceRequestImpactStatistics").build();
    private static final MarshallingInfo<List> TOPANOMALOUSSERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopAnomalousServices").build();

    private static final InsightMarshaller instance = new InsightMarshaller();

    public static InsightMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Insight insight, ProtocolMarshaller protocolMarshaller) {

        if (insight == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insight.getInsightId(), INSIGHTID_BINDING);
            protocolMarshaller.marshall(insight.getGroupARN(), GROUPARN_BINDING);
            protocolMarshaller.marshall(insight.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(insight.getRootCauseServiceId(), ROOTCAUSESERVICEID_BINDING);
            protocolMarshaller.marshall(insight.getCategories(), CATEGORIES_BINDING);
            protocolMarshaller.marshall(insight.getState(), STATE_BINDING);
            protocolMarshaller.marshall(insight.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(insight.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(insight.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(insight.getClientRequestImpactStatistics(), CLIENTREQUESTIMPACTSTATISTICS_BINDING);
            protocolMarshaller.marshall(insight.getRootCauseServiceRequestImpactStatistics(), ROOTCAUSESERVICEREQUESTIMPACTSTATISTICS_BINDING);
            protocolMarshaller.marshall(insight.getTopAnomalousServices(), TOPANOMALOUSSERVICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
