package com.codelaez.ezcommon.exception;

/**
 * @author khanhspring
 */
public class ForbiddenException extends ApplicationException {

    public ForbiddenException() {
        super(CommonError.FORBIDDEN);
    }
}
