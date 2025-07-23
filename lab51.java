/*program to implement method overriding*/
class Animal 
{
    void move()
    {
        System.out.println("Animal is moving");
    }
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal 
{
    void move()
    {
        System.out.println("Dog is moving");
    }
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
public class lab51 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
        d.bark();
        d.eat();
    }
}