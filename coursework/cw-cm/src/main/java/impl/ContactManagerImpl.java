package impl;

import spec.*;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Eric on 08/03/2017.
 */
public class ContactManagerImpl implements ContactManager, Serializable{

    private Set<Contact> contacts = new HashSet<>();

    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) throws IllegalArgumentException {
        Objects.requireNonNull(contacts, "Contacts cannot be null.");
        Objects.requireNonNull(date, "Calendar cannot be null.");
        return 0;
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
        Objects.requireNonNull(name, "Name is required cannot be null.");
        Objects.requireNonNull(notes, "Notes is required cannot be null.");

        if (name.equals("") || notes.equals("") || name.equals(null) || notes.equals(null)) {
            throw new IllegalArgumentException("Passed an empty String parameter");
        }
        Contact newContact = new ContactImpl(name,notes);
        contacts.add(newContact);
        return newContact.getId();

    }

    public Set<Contact> getContacts(String name) throws NullPointerException{
        Objects.requireNonNull(name,"Name is required cannot be null.");
        if(name.equals("")){
            return contacts;
        } else{
            return contacts.parallelStream()
                    .filter(i -> i.getName().equals(name))
                    .sorted(Comparator.comparing(Contact::getId))
                    .collect(Collectors.toSet());
        }
    }


    @Override
    public Set<Contact> getContacts(int... ids) {
        Objects.requireNonNull(ids,"ID is required cannot be null.");


        return null;
    }

    @Override
    public void flush() {

    }
}
