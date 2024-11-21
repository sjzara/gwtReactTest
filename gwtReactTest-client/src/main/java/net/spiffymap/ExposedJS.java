package net.spiffymap;

import com.google.gwt.user.client.Window;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import com.google.gwt.core.client.GWT;

@JsType(namespace = JsPackage.GLOBAL)
public class ExposedJS {
    private final int value;

    public ExposedJS(int value) {
        GWT.log("" + value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static native void exportTestMethod() /*-{
        $wnd.runTest = $entry(@net.spiffymap.ExposedJS::test());
    }-*/;
    public static void test() {
        var exposed = new ExposedJS(1234);
        Window.alert("" + exposed.getValue());
    }
}
