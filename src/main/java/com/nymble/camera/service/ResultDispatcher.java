package com.nymble.camera.service;

import com.nymble.camera.model.CaptureResult;
import com.nymble.camera.model.Log;
import org.springframework.stereotype.Service;

@Service
public class ResultDispatcher {
    private static ResultDispatcher instance;

    private ResultDispatcher() {}

    public static ResultDispatcher getInstance() {
        if (instance == null) {
            instance = new ResultDispatcher();
        }
        return instance;
    }

    public void dispatchResult(CaptureResult result) {
        if (result.getImageUrl() != null) {
            // Success case
            CallbackSystem.getInstance().notifySuccess(result);
        } else {
            // Failure case
            CallbackSystem.getInstance().notifyFailure(result);
        }
        StorageAndLogs.getInstance().storeLog(new Log(result.toString()));
    }
}