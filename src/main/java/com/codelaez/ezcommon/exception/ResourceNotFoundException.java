package com.codelaez.ezcommon.exception;

/**
 * @author khanhspring
 */
public class ResourceNotFoundException extends ApplicationException {

    public ResourceNotFoundException() {
        super(CommonError.RESOURCE_NOTFOUND);
    }
}
