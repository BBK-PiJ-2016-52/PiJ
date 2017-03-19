package impl;

import spec.Contact;
import spec.Meeting;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eric on 08/03/2017.
 *
 * An implementation of Meeting interface.
 */
public class MeetingImpl implements Meeting {
    private int id;
    private final Calendar date;
    private static Set<Contact> contacts = new HashSet<>();

    private int meetingId;

    public MeetingImpl(Calendar date, Set<Contact> contacts) {
        this.date = date;
        this.contacts = contacts;
        int idCounter = 0;
        idCounter++;
        meetingId = idCounter;
    }

    public MeetingImpl(int id, Set<Contact> contacts, Calendar date) {
        this.contacts = contacts;
        this.date = date;
    }

    @Override
    public int getId() {
        return meetingId;
    }

    @Override
    public Calendar getDate() {
        // Returning the cloned date so the object cannot be modified as per final initial state declared
        return (Calendar) this.date.clone();
    }

    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }
}