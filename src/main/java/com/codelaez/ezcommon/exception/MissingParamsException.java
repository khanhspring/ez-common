package com.codelaez.ezcommon.exception;

/**
 * @author khanhspring
 */
public class MissingParamsException extends ApplicationException {

    public MissingParamsException() {
        super(CommonError.MISSING_PARAMS);
    }
}
