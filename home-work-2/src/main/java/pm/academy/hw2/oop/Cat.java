package pm.academy.hw2.oop;

public class Cat extends Animal {
  private String name;
  private int weight;

  public Cat(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String getAnimalType() {
    return "cat";
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
