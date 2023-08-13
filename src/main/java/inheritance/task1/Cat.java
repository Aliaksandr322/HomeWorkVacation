package inheritance.task1;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}
