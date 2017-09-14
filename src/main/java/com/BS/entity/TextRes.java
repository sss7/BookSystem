package com.BS.entity;

import org.springframework.stereotype.Component;

@Component
public class TextRes {
    public String message() {
        return "Message#" + System.currentTimeMillis();
    }
}
