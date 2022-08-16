abstract class Feeling
{
    abstract void feels();
}
public class AnonDemoByClass {
    public static void main(String[] args)
    {
        Feeling Diksha=new Feeling() {
            @Override
            public void feels() {
                System.out.println("Diksha feels happy today");
            }
        };
        Diksha.feels();
    }
}
