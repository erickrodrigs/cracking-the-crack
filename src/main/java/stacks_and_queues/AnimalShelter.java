package stacks_and_queues;

public class AnimalShelter {
  public static enum ANIMAL_TYPES {Dog, Cat};
  private static int ID = 1;
  private LinkedQueue<Animal> queueDog;
  private LinkedQueue<Animal> queueCat;

  public AnimalShelter() {
    this.queueDog = new LinkedQueue<>();
    this.queueCat = new LinkedQueue<>();
  }

  public void enqueue(Animal animal) {
    if (animal.type == ANIMAL_TYPES.Dog) {
      queueDog.add(animal);
    } else {
      queueCat.add(animal);
    }
  }

  public Animal dequeueAny() {
    return queueDog.peek().id < queueCat.peek().id ? dequeueDog() : dequeueCat();
  }

  public Animal dequeueDog() {
    return queueDog.remove();
  }

  public Animal dequeueCat() {
    return queueCat.remove();
  }

  public boolean isEmpty() {
    return queueDog.isEmpty() && queueCat.isEmpty();
  }

  public static class Animal {
    private final int id;
    private final String name;
    private final AnimalShelter.ANIMAL_TYPES type;

    public Animal(String name, AnimalShelter.ANIMAL_TYPES type) {
      this.id = AnimalShelter.ID++;
      this.name = name;
      this.type = type;
    }

    public String getName() {
      return this.name;
    }
  }
}
