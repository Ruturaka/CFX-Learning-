interface Human
{
    void feels();
}

public class AnnoDemoByInterface {
    public static void main(String[] args)
    {
        Human Rutu=new Human() {
            @Override
            public void feels() {
                System.out.println("Rutu has feelings.");
            }
        };
        Rutu.feels();
    }
}
