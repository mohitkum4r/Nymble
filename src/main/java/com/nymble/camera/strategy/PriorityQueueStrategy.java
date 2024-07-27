package com.nymble.camera.strategy;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.service.PriorityQueue;

public class PriorityQueueStrategy implements QueueStrategy {
    private PriorityQueue priorityQueue;

    public PriorityQueueStrategy(PriorityQueue priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    @Override
    public CaptureRequest dequeue() {
        return priorityQueue.dequeue();
    }
}