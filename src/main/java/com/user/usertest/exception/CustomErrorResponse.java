package com.user.usertest.exception;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CustomErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public CustomErrorResponse(LocalDateTime timestamp, int status, 
        String error, String message, String path){
        this.timestamp=timestamp;
        this.status=status;
        this.error=error;
        this.message=message;
        this.path=path;
	}
}
