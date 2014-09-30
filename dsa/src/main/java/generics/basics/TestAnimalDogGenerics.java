package generics.basics;

import java.util.ArrayList;
import java.util.List;

public class TestAnimalDogGenerics {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		for(;;) {
			Dog dog = new Dog();
			dogs.add(dog);
			//ArrayList<Animal> animals = dogs;
			//takeAnimals(dogs);		
		}
		
	}
	
	public static void takeAnimals(List<? extends Animal> animals){

	}
}
