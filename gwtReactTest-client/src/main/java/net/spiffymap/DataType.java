package net.spiffymap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This demonstrates use of a JavaScript class in Java. 'isNative' means that code for native methods exists in JavaScript, not Java.
 * @author steve
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class DataType {

    public native void printSomething();
}
