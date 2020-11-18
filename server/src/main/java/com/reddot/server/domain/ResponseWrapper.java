package com.reddot.server.domain;

/**
 * 响应信息包装类
 *
 * @author Trey
 * @since 2020/11/18
 */

public class ResponseWrapper {
    private int statusCode;
    private String message;

    public ResponseWrapper(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
