
abstract class Animal{
    public abstract void makeSound();
    }

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog's sound: Buuh Buhh!!");
    }

}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat's sound: Meyeew!!");
    }
}


public class Main {
    public static void main(String[] args) {
    Dog newDog = new Dog();
    newDog.makeSound();

    Cat newCat = new Cat();
    newCat.makeSound();
    }
}