package com.nymble.camera.strategy;

import com.nymble.camera.model.CaptureRequest;

public interface QueueStrategy {
    CaptureRequest dequeue();
}
