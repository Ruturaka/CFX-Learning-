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

    public void show()
    {
        System.out.println("Radius of circle is: "+rad);
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
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

    Cylinder(int r,int h)
    {
        super(r);
        ht=h;
    }

    public double volume()
    {
        return Math.PI*rad*rad*ht;
    }

    public void show()
    {
        System.out.println("Radius of cylinder is: "+rad);
        System.out.println("Height of cylinder is: "+ht);
    }

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }
}
public class InheritancePracQue {
    public static void main(String[] args)
    {
        //Create a class circle and use inheritance to create another cylinder from it.

        Circle c=new Circle(23);
        c.setRad(7);
        System.out.println("Radius of circle is "+c.getRad());
        System.out.printf("\nArea of circle: %.2f\n",c.area());


        Cylinder cy=new Cylinder(5,17);
        cy.setHt(15);
        System.out.println("Radius & height of cylinder are "+cy.getRad()+" and "+cy.getHt());
        System.out.printf("\nVolume of cylinder: %.2f\n",cy.volume());

    }
}
