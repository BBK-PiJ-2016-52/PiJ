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
    FutureMeetingImpl(int id, Set<Contact> contacts, Calendar date) {
        super(id, contacts, date);
    }
}
