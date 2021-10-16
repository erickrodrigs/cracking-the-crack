package stacks_and_queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import stacks_and_queues.AnimalShelter.Animal;
import stacks_and_queues.AnimalShelter.ANIMAL_TYPES;

public class AnimalShelterTest {

  @Test
  public void testEnqueue() {
    Animal animal = new Animal("Adilson", ANIMAL_TYPES.Dog);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(animal);
    assertFalse(shelter.isEmpty());
  }

  @Test
  public void testDequeueAny() {
    Animal adilson = new Animal("Adilson", ANIMAL_TYPES.Dog);
    Animal gatito = new Animal("Gatito", ANIMAL_TYPES.Cat);

    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue(adilson);
    shelter.enqueue(gatito);

    assertEquals(adilson, shelter.dequeueAny());
  }

  @Test
  public void testDequeueDog() {
    Animal gatito = new Animal("Gatito", ANIMAL_TYPES.Cat);
    Animal adilson = new Animal("Adilson", ANIMAL_TYPES.Dog);

    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue(gatito);
    shelter.enqueue(adilson);

    assertEquals(adilson, shelter.dequeueDog());
  }

  @Test
  public void testDequeueCat() {
    Animal adilson = new Animal("Adilson", ANIMAL_TYPES.Dog);
    Animal gatito = new Animal("Gatito", ANIMAL_TYPES.Cat);

    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue(adilson);
    shelter.enqueue(gatito);

    assertEquals(gatito, shelter.dequeueCat());
  }
}
