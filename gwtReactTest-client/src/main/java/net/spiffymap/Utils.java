package net.spiffymap;

/**
 *
 * @author steve
 */
public class Utils {
    
    public static native void exportMethod() /*-{
        $wnd.getExampleArray = $entry(@net.spiffymap.Utils::getExampleArray());
    }-*/;

    public static ListEntry[] getExampleArray() {
        return new ListEntry[]{new ListEntry(1, "Steve", "Zara")};
    }
}
