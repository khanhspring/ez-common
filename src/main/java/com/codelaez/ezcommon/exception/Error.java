package com.codelaez.ezcommon.exception;

/**
 * @author khanhspring
 */
public interface Error {
    String getType();
    String getCode();
    String getSubCode();
    String getMessage();
}
