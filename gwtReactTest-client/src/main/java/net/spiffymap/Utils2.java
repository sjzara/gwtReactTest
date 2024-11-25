package net.spiffymap;

import jsinterop.annotations.JsType;

/**
 * Provide utility methods via JsInterop.
 *
 * @author steve
 */
@JsType
public interface Utils2 {

    public static ListEntry[] getExampleArray() {
        return new ListEntry[]{new ListEntry(2, "Jon", "Harley"), new ListEntry(4, "Someone", "Else")};
    }

    public static ListEntry getExampleEntry() {
        return new ListEntry(1, "Steve", "Zara");
    }
}
