package net.spiffymap;

import com.google.gwt.user.client.Window;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import com.google.gwt.core.client.GWT;

/**
 * This provides a class (ExposedJS) for JavaScript use, Specifying a namespace as GLOBAL means it 
 * needs no package qualifier (i.e. 'ExposedJS', not 'net.spiffymap.ExposedJS').
 * @author steve
 */
@JsType(namespace = JsPackage.GLOBAL)
public class ExposedJS {
    private final int value;

    /**
     * Constructor with GWT-based logging of value.
     * @param value 
     */
    public ExposedJS(int value) {
        GWT.log("" + value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    /**
     * Expose test() method to JavaScript as Window variable 'runTest'.
     */
    public static native void exportTestMethod() /*-{
        $wnd.runTest = $entry(@net.spiffymap.ExposedJS::test());
    }-*/;
    
    /**
     * Test construction using Window:alert to display contents,
     */
    public static void test() {
        var exposed = new ExposedJS(1234);
        Window.alert("" + exposed.getValue());
    }
}
