package com.nymble.camera.service;

import com.nymble.camera.model.CaptureRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrioritizationService {
    @Autowired
    private CaptureService captureService;

    public void determinePriority(CaptureRequest request) {
        captureService.processRequest(request);
    }
}
