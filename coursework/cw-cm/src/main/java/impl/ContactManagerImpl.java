package impl;

import spec.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Optional;

/**
 * Created by Eric on 08/03/2017.
 */
public class ContactManagerImpl implements ContactManager, Serializable{
    private ContactImpl contactImpl = new ContactImpl();
    public static int contactIdCount = 0;
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

        for (Contact i : allContacts) {
            System.out.println(i.getName());
            if (i.getName().equals(name)) {
                System.out.println("contact exists");
                return i.getId();
            }
        }

        /*if (name.equals("") || notes.equals("")) {
            throw new IllegalArgumentException("Empty String");
        }*/
        ContactImpl newContact = new ContactImpl(contactIdCount++, name, notes);
        allContacts.add(newContact);
        System.out.println(newContact + "added");

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
        Set<Contact> results = new HashSet<>();

        for (int i : ids) {
            if (i > contactIdCount) {
                throw new IllegalArgumentException("Error: ID out of range");
            }
            Optional<Contact> contacts = this.allContacts.stream()
                    .parallel()
                    .filter(c -> c.getId() == i)
                    .findAny();

            if (contacts.isPresent()) {
                results.add(contacts.get());
            } else {
                throw new IllegalArgumentException("Error: ID number not found");
            }
        }
        return results;    }

    @Override
    public void flush() {

    }
}
