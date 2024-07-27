package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.model.CaptureResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncCaptureManager {
    private static AsyncCaptureManager instance;

    private AsyncCaptureManager() {}

    public static AsyncCaptureManager getInstance() {
        if (instance == null) {
            instance = new AsyncCaptureManager();
        }
        return instance;
    }

    public void manageCapture(CaptureRequest request) {
        CaptureResult result = CameraHardwareInterface.getInstance().captureImage(request);
        ResultDispatcher.getInstance().dispatchResult(result);
    }
}
