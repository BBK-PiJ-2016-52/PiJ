package ex1_05;

public class UserImpl implements User {

  private String name;
  private int ID;
  private Library library;

  public UserImpl(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getID() {
    return ID;
  }

  @Override
  public void setID(int ID) {
    this.ID = ID;
  }

  @Override
  public int register(Library library) {
    this.library = library;
    this.ID = library.getID(this.name);
    return this.ID;
  }

  @Override
  public Library getLibrary() {
    return library;
  }
}
