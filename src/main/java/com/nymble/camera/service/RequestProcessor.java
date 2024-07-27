package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.strategy.QueueStrategy;
import org.springframework.stereotype.Service;

@Service
public class RequestProcessor {
    private QueueStrategy queueStrategy;

    public void setQueueStrategy(QueueStrategy strategy) {
        this.queueStrategy = strategy;
    }

    public void processFromQueue() {
        CaptureRequest request = queueStrategy.dequeue();
        if (request != null) {
            AsyncCaptureManager.getInstance().manageCapture(request);
        }
    }
}