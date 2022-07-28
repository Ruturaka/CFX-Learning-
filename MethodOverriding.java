class Animal
{
    // Rules - 1. private methods are not overridden
    // 2. final methods cannot be overridden
    // 3. Static methods can not be overridden(Method Overriding vs Method Hiding)
    // 4. The overriding method must have same return type(or sub-type)
    // 5. Invoking overriden methods frm sub-class -(we can call parent class
    // method in overriding method using super keyword)
    // 6. We cannot override a constructor as parent and child class can never have same name.

    // Static method in base class
    // which will be hidden in subclass
    static void eat()
    {
        System.out.println("Animal is eating ");
    }

    // Non-static method which will
    // be "overridden" in derived class
    public void move()
    {
        System.out.println("Animal is moving");
    }
    public void show()
    {
        System.out.println("Animal's show");
    }
}
class Dog extends Animal
{
    // This method hides m1() in Parent
    static void eat()
    {
        System.out.println("Dog is eating");
    }

    // This method "overrides" m2() in Parent
    //@override
    public void move()
    {
        System.out.println("Dog is moving");
    }
    public void show()
    {
       super.show();
        System.out.println("Dog's show");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        /*
        // method overriding in java
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called.
        Animal obj=new Animal();
        obj.move();


        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM
        Animal obj1=new Dog();
        obj1.move();*/

        Animal obj=new Dog();
        obj.eat();
        obj.move();
        obj.show();

    }

}
