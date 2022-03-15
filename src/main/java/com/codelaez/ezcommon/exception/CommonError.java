package com.codelaez.ezcommon.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author khanhspring
 */
@Getter
@AllArgsConstructor
public enum CommonError implements Error {

    SYSTEM_BUSY("999", "System busy"),
    UNAUTHORIZED("401", "Unauthorized error"),
    FORBIDDEN("403", "Forbidden error"),
    MISSING_PARAMS("400", "Missing parameters"),
    RESOURCE_NOTFOUND("404", "Resource not found");

    private final String subCode;
    private final String message;

    public String getType() {
        return "common";
    }

    public String getCode() {
        return "100";
    }
}
