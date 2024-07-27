package com.nymble.camera.strategy;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.service.StandardQueue;

public class StandardQueueStrategy implements QueueStrategy {
    private StandardQueue standardQueue;

    public StandardQueueStrategy(StandardQueue standardQueue) {
        this.standardQueue = standardQueue;
    }

    @Override
    public CaptureRequest dequeue() {
        return standardQueue.dequeue();
    }
}