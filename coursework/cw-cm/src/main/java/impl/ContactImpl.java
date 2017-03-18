package impl;

import spec.Contact;
import java.io.Serializable;

/**
 * Created by Eric on 08/03/2017.
 */

public class ContactImpl implements Contact, Serializable{
    private String name;
    private int id;
    private String notes = "";
    private static int idCounter = 0;
    private int contactId;

    public ContactImpl(){
  }

    public ContactImpl(String name){
    }

    public ContactImpl(String name, String notes) {
        this.notes = notes;
        this.name = name;
        idCounter++;
        contactId = idCounter;
    }

    ContactImpl(int id, String name, String notes){
        this.id = id;
        this.notes = notes;
        this.name = name;
        idCounter++;
        contactId = idCounter;
    }

    @Override
    public final int getId() {
        System.out.println(contactId);
        return contactId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getNotes() {
            return notes;
    }

    @Override
    public void addNotes(String note) {
        if (this.notes.isEmpty()) {
            this.notes = note;
        }else {
            this.notes += note;
        }
    }
}
