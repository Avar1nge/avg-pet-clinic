package pm.academy.hw2.oop;

import java.util.Arrays;

public class Veterinarian {
  private Animal[] animals = new Animal[0];
  private AnimalsJournal journal = new AnimalsJournal();

  public boolean canAnimalFly(Animal animal) {
    return animal instanceof FLying;
  }

  public boolean isAnimalPresent(Animal animal){
    for(Animal a: animals)
      if(a.equals(animal))
        return true;
    return false;
  }

  public void registerNewAnimal(Animal animal) {
    if(isAnimalPresent(animal))
      return;
    Animal[] tmp;
    tmp = (Arrays.copyOf(animals, animals.length + 1));
    animals = tmp;
    animals[animals.length - 1] = animal;
    journal.addNewAnimal(animal);
    Arrays.sort(journal.getAnimalsNames());
  }

  public String[] getListOfRegisteredAnimals() {
    return journal.getAnimalsNames();
  }

  public Animal findHeaviestAnimal() {
    Animal res = null;
    for(Animal animal: animals){
      if(res == null || res.getWeight()< animal.getWeight())
        res = animal;
    }
    return res;
  }
}
