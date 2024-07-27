package com.nymble.camera.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaptureResult {
    private String requestId;
    private String clientId;
    private String imageUrl;
    private String errorMessage;
}
