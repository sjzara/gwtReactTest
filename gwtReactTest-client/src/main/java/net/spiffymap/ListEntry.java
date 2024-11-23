package net.spiffymap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author steve
 */
@JsType(namespace = JsPackage.GLOBAL)
public record ListEntry(int id, String forename, String surname) {

    /**
     * @return the id
     */
    @Override
    public int id() {
        return id;
    }

    /**
     * @return the foreName
     */
    @Override
    public String forename() {
        return forename;
    }

    /**
     * @return the surname
     */
    @Override
    public String surname() {
        return surname;
    }

}
