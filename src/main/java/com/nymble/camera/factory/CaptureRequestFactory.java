package com.nymble.camera.factory;

import com.nymble.camera.model.Callback;
import com.nymble.camera.model.CaptureRequest;

public class CaptureRequestFactory {
    public static CaptureRequest createCaptureRequest(String requestId, String clientId, int urgency, Callback successCallback, Callback failureCallback) {
        CaptureRequest request = new CaptureRequest();
        request.setRequestId(requestId);
        request.setClientId(clientId);
        request.setUrgency(urgency);
        request.setSuccessCallback(successCallback);
        request.setFailureCallback(failureCallback);
        return request;
    }
}
