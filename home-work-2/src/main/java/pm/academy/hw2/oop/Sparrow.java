package pm.academy.hw2.oop;

public class Sparrow extends FLying {
  private String name;
  private int weight, maxFlyingDistance;

  public Sparrow(String name, int weight, int maxFlyingDistance) {
    this.name = name;
    this.weight = weight;
    this.maxFlyingDistance = maxFlyingDistance;
  }

  @Override
  public String getAnimalType() {
    return "sparrow";
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getWeight() {
    return weight;
  }
}
