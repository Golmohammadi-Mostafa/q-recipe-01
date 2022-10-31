package com.abn.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ResponseMsgDTO implements Serializable {
    private String message;
}