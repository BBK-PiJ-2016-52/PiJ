package impl;

import spec.Contact;
import spec.PastMeeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by Eric on 08/03/2017.
 */
public class PastMeetingImpl extends MeetingImpl implements PastMeeting {
    private String notes;

    public PastMeetingImpl(int id, Set<Contact> contacts, Calendar date, String notes) {
        super(id, contacts, date);
        this.notes = notes;

    }

    @Override
    public String getNotes() {
        return this.notes;
    }

    public void addNotes(String notes) {

        if (this.notes.isEmpty()) {
            this.notes = notes;

        } else {
            this.notes += " - " + notes;
        }
    }
}
