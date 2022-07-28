class Cylinder
{
    private int rad;
    private int ht;


    public Cylinder()
    {
        rad=0;
        ht=0;
    }
    public Cylinder(int rad,int ht)
    {
        this.rad=rad;
        this.ht=ht;
    }
    public int getRad()
    {
        return rad;
    }
    public int getHt()
    {
        return ht;
    }
    public double surfaceArea()
    {
        return 2*Math.PI*rad*ht +2*Math.PI*rad*rad;
    }
    public double volume()
    {
        return Math.PI*rad*rad*ht;
    }
}

class Rectangle
{
    private int l;
    private int b;

    public Rectangle()
    {
        l=4;
        b=4;
    }

    public Rectangle(int l,int b)
    {
        this.l = l;
        this.b = b;
    }

    public int getL()
    {
        return l;
    }

    public int getB()
    {
        return b;
    }
}

class Sphere
{
    private int rad;

    public Sphere()
    {
        rad=0;
    }
    public Sphere(int rad)
    {
        this.rad = rad;
    }
    public int getRad()
    {
        return rad;
    }
    public double surfaceArea()
    {
        return 4*Math.PI*rad*rad;
    }
    public double volume()
    {
        return 4*Math.PI*rad*rad*rad/3;
    }
}
public class PracticeCodes
{
    //1. Create a class Cylinder & use getters & setters to set its radius & height
    /*public static void main(String[] args)
    {
        Cylinder c=new Cylinder(23,45);
        System.out.println("Radius: "+ c.getRad());
        System.out.println("Height "+c.getHt());
        System.out.printf("\nSurface area of cylinder: %.2f",c.surfaceArea());
        System.out.printf("\nVolume of cylinder: %.2f",c.volume());*/

    //2. Overload a constructor used to initialize a rectangle of length 4 & breadth 5 for using cutom parameters

    /*public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        System.out.println("Length: "+ r1.getL());
        System.out.println("Breadth: "+r1.getB());

        Rectangle r2=new Rectangle(3,5);
        System.out.println("Length: "+ r2.getL());
        System.out.println("Breadth: "+r2.getB());
    }*/

    //3. Sphere

    public static void main(String[] args)
    {
        Sphere s=new Sphere(7);
        System.out.printf("Radius: %d",s.getRad());
        System.out.printf("\nSurface area: %.2f",s.surfaceArea());
        System.out.printf("\nVolume: %.2f",s.volume());

    }
}
