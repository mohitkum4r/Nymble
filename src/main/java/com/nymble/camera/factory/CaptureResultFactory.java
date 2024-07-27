package com.nymble.camera.factory;

import com.nymble.camera.model.CaptureResult;

public class CaptureResultFactory {
    public static CaptureResult createSuccessResult(String requestId, String clientId, String imageUrl) {
        CaptureResult result = new CaptureResult();
        result.setRequestId(requestId);
        result.setClientId(clientId);
        result.setImageUrl(imageUrl);
        return result;
    }

    public static CaptureResult createFailureResult(String requestId, String clientId, String errorMessage) {
        CaptureResult result = new CaptureResult();
        result.setRequestId(requestId);
        result.setClientId(clientId);
        result.setErrorMessage(errorMessage);
        return result;
    }
}