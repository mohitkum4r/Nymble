package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class StandardQueue {
    private LinkedList<CaptureRequest> requests = new LinkedList<>();

    public void enqueue(CaptureRequest request) {
        requests.addLast(request);
    }

    public CaptureRequest dequeue() {
        return requests.pollFirst();
    }
}