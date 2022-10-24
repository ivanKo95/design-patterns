package prototype;

public class PlasticTree extends Tree{

  private String position;

  public PlasticTree(String mass, int height) {
    super(mass, height);
  }

  @Override
  public Tree copy() {
    PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
    plasticTreeClone.setPosition(this.getPosition());
    return plasticTreeClone;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}
