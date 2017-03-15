package impl;

import spec.Contact;
import java.io.Serializable;

/**
 * Created by Eric on 08/03/2017.
 */

public class ContactImpl implements Contact, Serializable{
    private String name;
    private int id;
    private String s;
    private String notes;

    ContactImpl(){

    }

    public ContactImpl(String name, String notes) {
        this.notes = notes;
        this.name = name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getNotes() {
            return this.notes;
    }

    @Override
    public void addNotes(String note) {
        if (this.notes.isEmpty()) {
            this.notes = note;
        } else {
            this.notes = "" + note;
        }
    }
}
