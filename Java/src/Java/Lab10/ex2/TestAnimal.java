package Java.Lab10.ex2;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1= new Dog();
        dog1.greeting();
        Bigdog bigdog1 = new Bigdog();
        bigdog1.greeting();

        Animal animal1= new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new Bigdog();
        animal3.greeting();
//        Animal animal4 = new Animal();

        Dog dog2 = (Dog)animal2;
        Bigdog bigdog2 = (Bigdog)animal3;
        Dog dog3 = (Dog)animal3;
//        Cat cat2 = (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigdog2);
        bigdog2.greeting(dog2);
        bigdog2.greeting(bigdog1);
    }
}
