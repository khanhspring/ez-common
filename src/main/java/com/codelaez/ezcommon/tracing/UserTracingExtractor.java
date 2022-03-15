package com.codelaez.ezcommon.tracing;

/**
 * @author khanhspring
 */
public interface UserTracingExtractor {
    default String getUsername() {
        return null;
    }
}
