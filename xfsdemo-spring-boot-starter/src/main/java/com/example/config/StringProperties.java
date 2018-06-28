package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("xfs.service")
public class StringProperties {

    private String th;

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }
}
