package pm.academy.hw2.oop;

public abstract class Animal {

  abstract String getAnimalType();
  abstract String getName();
  abstract int getWeight();
  public String toString(){
    return "name: " + getName() + ", type: " + getAnimalType() + ", weight: " + getWeight();
  }
}
