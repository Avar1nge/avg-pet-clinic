package pm.academy.hw2.oop;


import java.util.Arrays;

class AnimalsJournal {
  private String[] names = new String[0];
  public void addNewAnimal(Animal animal) {
    String[] tmp;
    tmp = (Arrays.copyOf(names, names.length + 1));
    names = tmp;
    names[names.length - 1] = "name: " + animal.getName() + ", type: " + animal.getAnimalType() + ", weight: " + animal.getWeight();
  }

  public String[] getAnimalsNames(){
    return names;
  }
}
