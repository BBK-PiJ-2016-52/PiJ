package impl;

import spec.Contact;
import spec.Meeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by Eric on 08/03/2017.
 */
public class MeetingImpl implements Meeting {
    private int id;
    private Calendar date;
    private Set<Contact> contacts;

    public MeetingImpl(int id, Calendar nowDate, Set<Contact> contacts) {
        this.id = id;
        this.date = date;
        this.contacts = contacts;
    }

    public MeetingImpl(Calendar nowDate, Set<Contact> contacts) {

    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Calendar getDate() {
        return this.date;
    }

    @Override
    public Set<Contact> getContacts() {
        return this.contacts;
    }
}
