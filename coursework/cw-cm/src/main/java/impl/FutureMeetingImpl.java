package impl;

import spec.Contact;
import spec.FutureMeeting;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

/**
 * Created by Eric on 08/03/2017.
 *
 * An implementation of the FutureMeeting interface.
 */
public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting, Serializable{
    public FutureMeetingImpl(Calendar nowDate, Set<Contact> contacts) {
        super(nowDate, contacts);
    }

    /**
     * Returns the id of the meeting.
     *
     * @return the id of the meeting.
     */
    @Override
    public int getId() {
        return 0;
    }

    /**
     * Return the date of the meeting.
     *
     * @return the date of the meeting.
     */
    @Override
    public Calendar getDate() {
        return null;
    }

    /**
     * Return the details of people that attended the meeting.
     * <p>
     * The list contains a minimum of one contact (if there were
     * just two people: the user and the contact) and may contain an
     * arbitrary number of them.
     *
     * @return the details of people that attended the meeting.
     */
    @Override
    public Set<Contact> getContacts() {
        return null;
    }
}
