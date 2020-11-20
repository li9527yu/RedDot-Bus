package com.reddot.server.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;

/**
 * 响应信息包装类
 *
 * @author Trey
 * @since 2020/11/18
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResponseWrapper implements Serializable {
    private int statusCode;//200 or 500
    private Object message;

    public ResponseWrapper(int statusCode, Object message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
