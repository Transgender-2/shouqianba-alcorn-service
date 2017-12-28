package com.wosai.shouqianba.push.common;

import com.wosai.shouqianba.push.constants.Channel;


public class PushResponse {
    private Channel.StatusCode statusCode;
    private String result;

    public Channel.StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Channel.StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
