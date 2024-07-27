package com.nymble.camera.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaptureRequest {
    private String requestId;
    private String clientId;
    private int urgency;
    private Callback successCallback;
    private Callback failureCallback;
}
