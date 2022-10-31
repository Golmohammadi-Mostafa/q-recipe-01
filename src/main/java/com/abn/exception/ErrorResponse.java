package com.abn.exception;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ErrorResponse implements Serializable {
    private String errorMessage;
    private int errorCode;
}
