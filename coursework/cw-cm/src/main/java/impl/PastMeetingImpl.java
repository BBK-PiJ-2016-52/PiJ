package impl;

import spec.Contact;
import spec.PastMeeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by Eric on 08/03/2017.
 */
public class PastMeetingImpl extends MeetingImpl implements PastMeeting {
    private String notes = "";

    public PastMeetingImpl(int id, Set<Contact> contacts, Calendar date) {
        super(id, contacts, date);
    }

    @Override
    public String getNotes() {
        return notes;
    }

    public void addNotes(String note) {
        notes += note;
    }
}