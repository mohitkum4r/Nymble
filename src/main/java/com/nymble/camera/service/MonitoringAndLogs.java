package com.nymble.camera.service;

import com.nymble.camera.model.Metric;
import com.nymble.camera.model.RequestLog;
import org.springframework.stereotype.Service;

@Service
public class MonitoringAndLogs {
    private static MonitoringAndLogs instance;

    private MonitoringAndLogs() {}

    public static MonitoringAndLogs getInstance() {
        if (instance == null) {
            instance = new MonitoringAndLogs();
        }
        return instance;
    }

    public void trackPerformance(Metric metric) {
        // Track performance logic
    }

    public void logRequest(RequestLog requestLog) {
        // Log request logic
    }
}

