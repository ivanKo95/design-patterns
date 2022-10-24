package prototype;

public class PineTree extends Tree {
  private String position;

  public PineTree(String mass, int height) {
    super(mass, height);
  }

  @Override
  public Tree copy() {
    PineTree pineTreeClone = new PineTree(this.getMass(), this.height);
    pineTreeClone.setPosition(this.getPosition());
    return pineTreeClone;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}
