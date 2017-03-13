package impl;

import spec.*;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.ArrayList;

/**
 * Created by Eric on 08/03/2017.
 */
public class ContactManagerImpl implements ContactManager, Serializable{
    public static List<Contact> allContacts = new ArrayList<>();



    /**
     * Add a new meeting to be held in the future.
     * <p>
     * An ID is returned when the meeting is put into the system. This
     * ID must be positive and non-zero.
     *
     * @param contacts a set of contacts that will participate in the meeting
     * @param date the date on which the meeting will take place
     * @return the ID for the meeting
     * @throws IllegalArgumentException if the meeting is set for a time
     *                                  in the past, of if any contact is unknown / non-existent.
     * @throws NullPointerException     if the meeting or the date are null
     */
    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) throws IllegalArgumentException {
        Objects.requireNonNull(contacts,"Contact is null.");
        Objects.requireNonNull(date,"Date is null.");
        if(date.after(Calendar.getInstance())){
            throw new IllegalArgumentException("Meeting set for a time in the past.");
        }
        return 1;
    }


    @Override
    public PastMeeting getPastMeeting(int id) {
        return null;
    }

    @Override
    public FutureMeeting getFutureMeeting(int id) {
        return null;
    }

    @Override
    public Meeting getMeeting(int id) {
        return null;
    }

    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        return null;
    }

    @Override
    public List<Meeting> getMeetingListOn(Calendar date) {
        return null;
    }

    @Override
    public List<PastMeeting> getPastMeetingListFor(Contact contact) {
        return null;
    }

    @Override
    public int addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {
        return 0;
    }

    @Override
    public PastMeeting addMeetingNotes(int id, String text) {
        return null;
    }

    @Override
    public int addNewContact(String name, String notes) {
        Objects.requireNonNull(name, "name can't be null");
        Objects.requireNonNull(notes, "notes can't be null");
        if (name.equals("") || notes.equals("")) {
            throw new IllegalArgumentException("Empty String");
        }
        Contact newContact = new ContactImpl(name, notes);
        newContact.addNotes(notes);
        allContacts.add(newContact);
        return newContact.getId();
    }
    /**
     * Returns a set with the contacts whose name contains that string.
     * <p>
     * If the string is the empty string, this methods returns the set
     * that contains all current contacts.
     *
     * @param name the string to search for
     * @return a set with the contacts whose name contains that string.
     * @throws NullPointerException if the parameter is null
     */
    @Override
    public Set<Contact> getContacts(String name) throws NullPointerException{
        Objects.requireNonNull(name,"name can't be null");
        if(name.equals("")){
            return (Set<Contact>) allContacts;
        }
        return (Set<Contact>) allContacts;
    }

    @Override
    public Set<Contact> getContacts(int... ids) {
        return null;
    }

    @Override
    public void flush() {

    }
}
