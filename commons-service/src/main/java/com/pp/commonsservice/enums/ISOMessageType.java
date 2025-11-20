package com.pp.commonsservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum representing different ISO message types.
 *
 * @author caito
 *
 */
@AllArgsConstructor
@Getter
public enum ISOMessageType {
    AUTHORIZATION_REQUEST("0200"),
    AUTHORIZATION_RESPONSE("0210"),
    REVERSAL_REQUEST("0420"),
    REVERSAL_RESPONSE("0430");

    private final String code;
}
