package com.nymble.camera.controller;

import com.nymble.camera.model.CaptureRequest;
import com.nymble.camera.service.PrioritizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/capture")
public class CaptureController {

    @Autowired
    private PrioritizationService prioritizationService;

    @PostMapping
    public String captureImage(@RequestBody CaptureRequest request) {
        prioritizationService.determinePriority(request);
        return "Capture request submitted";
    }
}
