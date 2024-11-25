package net.spiffymap;

/**
 *
 * @author steve
 */
public class Utils {

    /**
     * This shows how to give access to a Java static method to JavaScript via JSNI.
     * {@code getExampleArray()} is available as a Window-scope function after
     * {@code exportMethod} is run.
     */
    public static native void exportMethod() /*-{
        $wnd.getExampleArray = $entry(@net.spiffymap.Utils::getExampleArray());
    }-*/;

    /**
     *
     * @return a list of ListEntrieS
     */
    public static ListEntry[] getExampleArray() {
        return new ListEntry[]{new ListEntry(1, "Steve", "Zara"), new ListEntry(2, "Jeff", "Bloggs")};
    }
}
