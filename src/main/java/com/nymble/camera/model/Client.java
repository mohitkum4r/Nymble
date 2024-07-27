package com.nymble.camera.model;

import com.nymble.camera.service.PrioritizationService;

public class Client {
    private String clientId;
    private Callback successCallback;
    private Callback failureCallback;

    public void submitCaptureRequest(CaptureRequest request, PrioritizationService prioritizationService) {
        prioritizationService.determinePriority(request);
    }

    public void onSuccess(CaptureResult result) {
        successCallback.execute(result);
    }

    public void onFailure(CaptureResult result) {
        failureCallback.execute(result);
    }

}