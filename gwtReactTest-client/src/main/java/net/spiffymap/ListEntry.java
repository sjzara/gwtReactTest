package net.spiffymap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
 * A an example of making a record type available to JavaScript.  JavaScript will have access to the
 * automatically provided methods, such as accessors.
 * @author steve
 */
@JsType(namespace = JsPackage.GLOBAL)
public record ListEntry(int id, String forename, String surname) {

}
