package hw8Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();// single inheritance

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); // single inheritance
		bullDog.mammalInfo(); // multilevel inheritance
		bullDog.animalInfo(); // hierarchy inheritance

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();// single inheritance
		cobra.animalInfo();  // hierarchy inheritance
		cobra.reptileInfo();// multilevel inheritance

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();// single inheritance
		dog.animalInfo();// hierarchy inheritance

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

	}
}
