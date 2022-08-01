package codewithrutu.shape;
import java.lang.Math;


class Square
{
    private int side;

    Square(int s)
    {
        side=s;
    }
    Square()
    {
        side=0;
    }

    public int area()
    {
        return side*side;
    }
    public int getSide()
    {
        return side;
    }
    public void setSide(int s)
    {
        side=s;
    }
}

class Rectangle
{
    private int l;
    private int b;

    Rectangle()
    {
        l=b=0;
    }
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public int area()
    {
        return l*b;
    }

    public int getlen()
    {
        return l;
    }
    public int getbre()
    {
        return b;
    }
    public void setlen(int l)
    {
        this.l=l;
    }
    public void setbre(int l)
    {
        this.b=b;
    }


}
class Circle
{
    protected int rad;

    Circle()
    {
        rad=0;
    }
    Circle(int r)
    {
        rad=r;
    }
    public double area()
    {
        return Math.PI*rad*rad;
    }
    public int getRad()
    {
        return rad;
    }
    public void setRad(int rad)
    {
        this.rad=rad;
    }

}
class Cylinder extends Circle
{
    private int ht;

    Cylinder()
    {
        super();
        ht=0;
    }
    Cylinder(int rad,int ht)
    {
        super(rad);
        this.ht=ht;
    }
    public double area()
    {
        return 2*Math.PI*rad*ht + 2*Math.PI*rad*rad;
    }
    public double volume()
    {
        return super.area()*ht;
    }
    public int getHt()
    {
        return ht;
    }
    public void setHt(int ht)
    {
        this.ht=ht;
    }

}
class Sphere extends Circle
{
    Sphere()
    {
        super();
    }
    Sphere(int r)
    {
        super(r);
    }
    public double area()
    {
        return 4*super.area();
    }
    public double volume()
    {
        return rad*area()/3;
    }
}

public class Shapes
{
    public static void main(String[] args)
    {
        Square s=new Square(5);
        Rectangle r=new Rectangle(4,6);
        Circle c=new Circle(7);
        Cylinder cy=new Cylinder(5,17);
        Sphere sp=new Sphere(6);

        System.out.printf("\nArea of square is: %d",s.area());
        System.out.printf("\nArea of rectangle is: %d",r.area());
        System.out.printf("\nArea of circle is: %.2f",c.area());
        System.out.printf("\nArea of cyliner is: %.2f",cy.area());
        System.out.printf("\nvolume of cylinder is: %.2f",cy.volume());
        System.out.printf("\nArea of sphere is: %.2f",sp.area());
        System.out.printf("\nVolume of sphere is: %.2f",sp.volume());

    }
}
