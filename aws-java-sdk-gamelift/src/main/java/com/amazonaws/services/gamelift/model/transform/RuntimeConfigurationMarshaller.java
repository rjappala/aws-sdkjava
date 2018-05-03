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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuntimeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuntimeConfigurationMarshaller {

    private static final MarshallingInfo<List> SERVERPROCESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerProcesses").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENTGAMESESSIONACTIVATIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrentGameSessionActivations").build();
    private static final MarshallingInfo<Integer> GAMESESSIONACTIVATIONTIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionActivationTimeoutSeconds").build();

    private static final RuntimeConfigurationMarshaller instance = new RuntimeConfigurationMarshaller();

    public static RuntimeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuntimeConfiguration runtimeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (runtimeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(runtimeConfiguration.getServerProcesses(), SERVERPROCESSES_BINDING);
            protocolMarshaller.marshall(runtimeConfiguration.getMaxConcurrentGameSessionActivations(), MAXCONCURRENTGAMESESSIONACTIVATIONS_BINDING);
            protocolMarshaller.marshall(runtimeConfiguration.getGameSessionActivationTimeoutSeconds(), GAMESESSIONACTIVATIONTIMEOUTSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
