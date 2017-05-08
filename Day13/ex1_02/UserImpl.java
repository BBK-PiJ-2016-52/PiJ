package ex1_02;

public class UserImpl implements User {

  private final String name;
  private int ID;

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


}
