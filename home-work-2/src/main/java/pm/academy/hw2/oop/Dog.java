package pm.academy.hw2.oop;

public class Dog extends Animal {
  private String name;
  private int weight;

  public Dog(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String getAnimalType() {
    return "dog";
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
