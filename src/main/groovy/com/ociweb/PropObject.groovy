package com.ociweb

/**
 * Created by zak on 9/7/16.
 */
class PropObject {

    Integer value
    String object = "object"

    public PropObject(Integer v) {
        value = v
    }

    String toString() {
        "PropObject:${value}"
    }
}
