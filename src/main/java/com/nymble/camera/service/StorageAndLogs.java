package com.nymble.camera.service;

import com.nymble.camera.model.CaptureResult;
import com.nymble.camera.model.Log;
import org.springframework.stereotype.Service;

@Service
public class StorageAndLogs {
    private static StorageAndLogs instance;

    private StorageAndLogs() {}

    public static StorageAndLogs getInstance() {
        if (instance == null) {
            instance = new StorageAndLogs();
        }
        return instance;
    }

    public void storeImage(CaptureResult image) {
        // Store image logic
    }

    public void storeLog(Log log) {
        // Store log logic
    }
}