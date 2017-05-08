package ex04_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStringStackTest {

  StringStack ss;

  @Before
  public void setUp() {
    ss = new ArrayStringStack();
  }

  @Test
  public void testsPushThreeStringsThenPopOne() {
    ss.push("Mark");
    ss.push("Anna");
    ss.push("Elizabeth");
    assertEquals("Elizabeth", ss.pop());
  }

  @Test
  public void testsPushThreeStringsThenPopTwo() {
    ss.push("Mark");
    ss.push("Anna");
    ss.push("Elizabeth");
    assertEquals("Elizabeth", ss.pop());
    assertEquals("Anna", ss.pop());
  }

  @Test
  public void testsPushOneStringsThenPopTop() {
    ss.push("Mark");
    assertEquals("Mark", ss.pop());
  }

  @Test
  public void testsPopAnEmptyStack() {
    assertNull(ss.pop());
  }

  @Test
  public void testsPushOnePopItThenPopThatEmptyStack() {
    ss.push("Mark");
    assertEquals("Mark", ss.pop());
    assertNull(ss.pop());
  }

  @Test
  public void testsPushThreeStringsThenPeekOne() {
    ss.push("Mark");
    ss.push("Anna");
    ss.push("Elizabeth");
    assertEquals("Elizabeth", ss.peek());
  }


  @Test
  public void testsPushThreeStringsThenPeekTwice() {
    ss.push("Mark");
    ss.push("Anna");
    ss.push("Elizabeth");
    assertEquals("Elizabeth", ss.peek());
    assertEquals("Elizabeth", ss.peek());
  }

  @Test
  public void testsPushOneStringsThenPeekTop() {
    ss.push("Mark");
    assertEquals("Mark", ss.peek());
  }

  @Test
  public void testsPeekAnEmptyStack() {
    assertNull(ss.peek());
  }

  @Test
  public void testsIsEmptyOnEmptyStack() {
    assertTrue(ss.isEmpty());
  }

  @Test
  public void testsIsEmptyOnNotEmptyStack() {
    ss.push("Mark");
    assertFalse("Not empty stack so isEmpty() should be false", ss.isEmpty());
  }
}

