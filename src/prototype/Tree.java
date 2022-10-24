package prototype;

public abstract class Tree {
  String mass;
  int height;

  public abstract Tree copy();

  public Tree(String mass, int height) {
    this.mass = mass;
    this.height = height;
  }

  public String getMass() {
    return mass;
  }

  public void setMass(String mass) {
    this.mass = mass;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
