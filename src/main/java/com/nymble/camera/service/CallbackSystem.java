package com.nymble.camera.service;

import com.nymble.camera.model.CaptureResult;
import com.nymble.camera.model.Client;

public class CallbackSystem {
    private static CallbackSystem instance;

    private CallbackSystem() {}

    public static CallbackSystem getInstance() {
        if (instance == null) {
            instance = new CallbackSystem();
        }
        return instance;
    }

    public void notifySuccess(CaptureResult result) {
        // Fetch client and call success callback
        Client client = fetchClient(result.getClientId());
        client.onSuccess(result);
    }

    public void notifyFailure(CaptureResult result) {
        // Fetch client and call failure callback
        Client client = fetchClient(result.getClientId());
        client.onFailure(result);
    }

    private Client fetchClient(String clientId) {
        // Fetch client logic (mocked for this example)
        return new Client();
    }
}
