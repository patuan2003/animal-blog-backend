package com.server.blog.dto.response;

public class ResponseError extends ResponseData{

    public ResponseError(int status, String message, Object data) {
        super(status, message, data);
    }
}
