package net.spiffymap;

import jsinterop.annotations.JsType;

/**
 * Use of JsInterop
 *
 * @author steve
 */
@JsType
public class Utils2 {

    public static ListEntry[] getExampleArray() {
        return new ListEntry[]{new ListEntry(2, "Jon", "Harley"),new ListEntry(4, "Someone", "Else")};
    }
}
