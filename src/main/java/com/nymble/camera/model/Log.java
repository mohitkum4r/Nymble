package com.nymble.camera.model;

import java.util.Date;

public class Log {
    private String message;
    private Date timestamp;

    public Log(String message) {
        this.message = message;
        this.timestamp = new Date();
    }

}
