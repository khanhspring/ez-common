package com.codelaez.ezcommon.exception;

import lombok.Getter;

/**
 * @author khanhspring
 */
@Getter
public class ApplicationException extends RuntimeException {

    private final Error error;

    public ApplicationException(Error error) {
        super(error.getMessage());
        this.error = error;
    }
}
