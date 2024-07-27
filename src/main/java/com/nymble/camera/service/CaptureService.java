package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import org.springframework.beans.factory.annotation.Autowired;


public class CaptureService {
    @Autowired
    private PriorityQueue priorityQueue;
    @Autowired
    private StandardQueue standardQueue;

    public void processRequest(CaptureRequest request) {
        if (request.getUrgency() > 5) { // Assuming urgency > 5 is high priority
            priorityQueue.enqueue(request);
        } else {
            standardQueue.enqueue(request);
        }
    }
}
