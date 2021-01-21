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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2NetworkInterfaceIpV6AddressDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2NetworkInterfaceIpV6AddressDetailMarshaller {

    private static final MarshallingInfo<String> IPV6ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpV6Address").build();

    private static final AwsEc2NetworkInterfaceIpV6AddressDetailMarshaller instance = new AwsEc2NetworkInterfaceIpV6AddressDetailMarshaller();

    public static AwsEc2NetworkInterfaceIpV6AddressDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2NetworkInterfaceIpV6AddressDetail awsEc2NetworkInterfaceIpV6AddressDetail, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2NetworkInterfaceIpV6AddressDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2NetworkInterfaceIpV6AddressDetail.getIpV6Address(), IPV6ADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
