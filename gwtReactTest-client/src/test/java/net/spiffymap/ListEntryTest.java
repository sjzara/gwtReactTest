package net.spiffymap;

import com.google.gwt.junit.client.GWTTestCase;
import org.junit.Test;

/**
 * How to test GWT classes. JUnit 4 or earlier is used.
 *
 * @author steve
 */
public class ListEntryTest extends GWTTestCase {

    public ListEntryTest() {
    }

    /**
     * Specifies a module to use when running this test case. The returned
     * module must include the source for this class.
     *
     * @see com.google.gwt.junit.client.GWTTestCase#getModuleName()
     */
    @Override
    public String getModuleName() {
        return "net.spiffymap.App";
    }

    /**
     * Test of toString method, of class ListEntry.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListEntry instance = new ListEntry(1, "Steve", "Smith");
        String expResult = "ListEntry[id=1, forename=Steve, surname=Smith]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
