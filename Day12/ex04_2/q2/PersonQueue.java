package ex04_2.q2;

public interface PersonQueue {

  /**
   * Adds another person to the queue
   */

  void insert(Person person);

  /**
   * Removes a person from the queue
   */

  Person retrieve();

}

