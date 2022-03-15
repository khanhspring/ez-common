package com.codelaez.ezcommon.exception;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author khanhspring
 */
@Data
@Builder
public class ErrorResponse {
    private String type;
    private String code;
    private String subCode;
    private String message;
    private String traceId;
    private List<ErrorDetail> details;

    public static class ErrorDetail {
        private String field;
        private String message;
    }
}
