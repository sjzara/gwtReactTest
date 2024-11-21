package net.spiffymap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 * @author steve
 */
@JsType(namespace = JsPackage.GLOBAL)
public class ListEntry {
    private final  int id;
    private final String forename;
    private final String surname;

    public ListEntry(int id, String forename, String surname) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the foreame
     */
    public String getForename() {
        return forename;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

}
