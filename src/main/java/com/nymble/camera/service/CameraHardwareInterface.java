package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.model.CaptureResult;
import org.springframework.stereotype.Service;

@Service
public class CameraHardwareInterface {
    private static CameraHardwareInterface instance;

    private CameraHardwareInterface() {}

    public static CameraHardwareInterface getInstance() {
        if (instance == null) {
            instance = new CameraHardwareInterface();
        }
        return instance;
    }

    public CaptureResult captureImage(CaptureRequest request) {
        // Simulate image capture
        CaptureResult result = new CaptureResult();
        result.setRequestId(request.getRequestId());
        result.setClientId(request.getClientId());
        // Assuming the capture can succeed or fail randomly
        if (Math.random() > 0.5) {
            result.setImageUrl("http://image.url/captured.jpg");
        } else {
            result.setErrorMessage("Capture failed due to hardware error.");
        }
        return result;
    }
}
