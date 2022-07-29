abstract class Pen
{
    abstract void write();
    abstract void refil();
}
class FountainPen extends Pen
{
    void write()
    {
        System.out.println("Write");
    }
    void refil()
    {
        System.out.println("Refil");
    }
    void changeNib()
    {
        System.out.println("Changing the nib");
    }
}
class Monkey
{
    void jump()
    {
        System.out.println("Jumps");
    }
    void bite()
    {
        System.out.println("Bites");
    }
}
interface BasicAnimal
{
    default void eat(){
        System.out.println("Animal is eating ");
    }
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping..");
    }
    public void speak()
    {
        System.out.println("Heyyya");
    }
}
abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone
{
    void ring()
    {
        System.out.println("Ring");
    }
    void lift()
    {
        System.out.println("Lift");
    }
    void disconnect()
    {
        System.out.println("Disconnect");
    }
}
interface TvRemote
{
    void channel(String channel);
    void volume(int n);
}
interface SmartTvRemote extends TvRemote
{
    void voiceCommand(String show);
}
class TV implements SmartTvRemote
{
    public void channel(String channel)
    {
        System.out.println("you are watching "+channel);
    }
    public void volume(int n)
    {
        System.out.println("Vol - "+n);;
    }
    public void  voiceCommand(String show)
    {
        System.out.println(show);
    }
}
public class PracQueOnAbstractnInterfaces {

    public static void main(String[] args)
    {
        //1. Pen class
        /*FountainPen pen=new FountainPen();
        pen.write();
        pen.refil();
        pen.changeNib(); */

        //2. Human class that inherits Monkey class & implements
        // BasicAnimal interface.
        /*Human h=new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        h.speak();
        */
        Monkey m1=new Human();
        m1.bite();
        m1.jump();
        //m1.speak(); // not allowed
        //m1.eat(); //not allowed


        //3. SmartPhone inherits frm TelePhone
        /*
        TelePhone p=new SmartTelephone();
        p.ring();
        p.lift();
        p.disconnect();*/

        //4. Interface TvRemote iherits another SmartPhoneTvRemote.
        //Class TV which implements TvRemote
        TV firestick=new TV();
        firestick.channel("Sab TV");
        firestick.voiceCommand("Open the Youtube app");
        firestick.volume(60);
    }
}
