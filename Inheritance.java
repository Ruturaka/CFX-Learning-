
class Base
{
    public int x;

    Base()
    {
        x=0;
    }
    Base(int x)
    {
        this.x=x;
    }
    public int getX() {
        return x;
    }
}
class Derived extends Base
{
    public int y;

    Derived()
    {
        y=0;
    }
    Derived(int x,int y)
    {
        super(x);
        this.y=y;
    }

    public int getY()
    {
        return y;
    }
}
class ChildOfDerived extends Derived
{
    public int z;
    ChildOfDerived()
    {
        z=0;
    }
    ChildOfDerived(int x,int y,int z)
    {
        super(x,y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }
}
public class Inheritance {
    public static void main(String[] args)
    {
        //Base b=new Base();
        Base b2=new Base(17);
        //Derived d=new Derived();
        Derived d2=new Derived(23,5);
        System.out.println("For base -> x="+b2.getX());
        System.out.println("For derived -> x="+d2.getX()+" & y="+d2.getY());

        ChildOfDerived cd=new ChildOfDerived(17,5,22);
        System.out.println("For derived -> x="+cd.getX()+", y="+cd.getY()+", z="+cd.getZ());


    }

}
