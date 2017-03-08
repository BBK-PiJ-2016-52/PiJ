package test;

import impl.ContactImpl;
import org.junit.Before;
import org.junit.Test;
import spec.Contact;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ContactTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testContactConstructorName() {
        try {
            new ContactImpl("name", "name");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testContactConstructorSetName() {
        Contact sue = (Contact) new ContactImpl("name", "sue");
        assertEquals("sue", sue.getName());
    }

    @Test
    public void testContactConstructorNameNotes() {
        try {
            new ContactImpl("name", "notes");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testContactConstructorSetNameNotes() {
        Contact sue = (Contact) new ContactImpl("sue", "notes1");
        assertEquals("sue", sue.getName());
        assertEquals("notes1", sue.getNotes());
    }

    @Test
    public void testGetNotesNone() {
        Contact sue = (Contact) new ContactImpl("name", "sue");
        assertEquals("", sue.getNotes());
    }

    @Test
    public void testAddNotesSingle() {
        Contact sue = (Contact) new ContactImpl("name", "sue");
        sue.addNotes("notes1");
        assertEquals("notes1", sue.getNotes());
    }


    @Test
    public void testAddNotesMultiple() {
        Contact sue = (Contact) new ContactImpl("sue", "notes1");
        sue.addNotes("notes2");
        sue.addNotes("notes3");
        String returned = sue.getNotes();

        assertTrue(returned.contains("notes1"));
        assertTrue(returned.contains("notes2"));
        assertTrue(returned.contains("notes3"));
    }

    @Test
    public void testContactUniqueIds() {
        Contact jim = (Contact) new ContactImpl("name", "jim");
        Contact mike = (Contact) new ContactImpl("name", "mike");

        assertThat(jim.getId(), is(not(equalTo(mike.getId()))));
    }

}
