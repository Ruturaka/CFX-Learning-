package codewithrutu;
@FunctionalInterface
interface Fashion
{
    void feels();
}
public class AnnoDemo
{
    public static void main(String[] args)
    {
        Fashion Diksha=new Fashion() {
            @Override
            public void feels() {
                System.out.println("Happyy Diksha over anything else>>3");
            }
        };
        Diksha.feels();
    }
}
