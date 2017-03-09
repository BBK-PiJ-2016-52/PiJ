package test;

import spec.Contact;
import spec.FutureMeeting;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

/**
 * Created by Eric on 09/03/2017.
 */
public class FutureMeetingTest extends MeetingTest implements Serializable{
    public FutureMeetingTest(Calendar nowDate, Set<Contact> contacts){
        super();
    }

}
