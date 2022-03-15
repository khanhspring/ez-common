package com.codelaez.ezcommon.exception;

/**
 * @author khanhspring
 */
public class UnauthorizedException extends ApplicationException {

    public UnauthorizedException() {
        super(CommonError.UNAUTHORIZED);
    }
}
