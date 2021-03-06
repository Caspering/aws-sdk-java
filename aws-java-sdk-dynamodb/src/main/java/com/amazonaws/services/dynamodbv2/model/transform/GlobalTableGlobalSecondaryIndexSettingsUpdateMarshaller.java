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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GlobalTableGlobalSecondaryIndexSettingsUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GlobalTableGlobalSecondaryIndexSettingsUpdateMarshaller {

    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<Long> PROVISIONEDWRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedWriteCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProvisionedWriteCapacityAutoScalingSettingsUpdate").build();

    private static final GlobalTableGlobalSecondaryIndexSettingsUpdateMarshaller instance = new GlobalTableGlobalSecondaryIndexSettingsUpdateMarshaller();

    public static GlobalTableGlobalSecondaryIndexSettingsUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GlobalTableGlobalSecondaryIndexSettingsUpdate globalTableGlobalSecondaryIndexSettingsUpdate, ProtocolMarshaller protocolMarshaller) {

        if (globalTableGlobalSecondaryIndexSettingsUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller
                    .marshall(globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits(), PROVISIONEDWRITECAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate(),
                    PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
