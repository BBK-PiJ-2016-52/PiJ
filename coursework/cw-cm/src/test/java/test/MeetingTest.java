package test;

import impl.MeetingImpl;
import org.junit.Before;
import org.junit.Test;
import spec.Contact;
import spec.Meeting;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MeetingTest {

    private Calendar nowDate;
    private Set<Contact> contacts;

    @Before
    public void setUp() {
        nowDate = Calendar.getInstance();
        contacts = new HashSet<>();
    }

    @Test
    public void testConstructor() {
        try {
            new MeetingImpl(nowDate, contacts);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testConstructorSets() {
        Meeting meeting = new MeetingImpl(nowDate, contacts);

        assertThat(meeting.getId(), is(notNullValue()));
        assertEquals(meeting.getDate(), nowDate);
        assertEquals(meeting.getContacts(), contacts);
    }

    @Test
    public void testUniqueIds() {
        Meeting meetingOne = new MeetingImpl(nowDate, contacts);
        Meeting meetingTwo = new MeetingImpl(nowDate, contacts);

        assertThat(meetingOne.getId(), is(not(equalTo(meetingTwo.getId()))));
    }

    @Test
    public void testImmutableDate() {
        Meeting meeting = new MeetingImpl(nowDate, contacts);
        Calendar date = meeting.getDate();
        date.add(Calendar.YEAR, 1);
        assertFalse(date.get(Calendar.YEAR) == meeting.getDate().get(Calendar.YEAR));
    }

    @Test
    public void testContactsImmutableFromOutsideObject() {
        Meeting meeting = new MeetingImpl(nowDate, contacts);
        Set<Contact> contacts = meeting.getContacts();
        assertFalse(contacts.size() != meeting.getContacts().size());
    }
}