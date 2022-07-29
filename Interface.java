class CellPhone{
    void call()
    {
        System.out.println("Calling...");
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
    void sms(String msg)
    {
        System.out.println(msg);
    }
}
interface GPS{
    void location(int lat,int lon);
}
interface Wifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("\nGood morning -  ");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k... in camera");
    }
}
interface MediaPlayer{
    void music(String song);
}
class SmartPhone extends CellPhone implements GPS,Camera,MediaPlayer,Wifi
{
    public void location(int lat,int lon)
    {
        System.out.println("Your location coordinates are:\n"
                +"latitude: "+lat+"\nlongitude: "+lon);
    }
    public void takeSnap()
    {
        System.out.println("Taking a snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording your video");
    }
   /* public void record4kVideo(){
        System.out.println("Recording in 4k video in Smartphone");
    }*/
    public void music(String song)
    {
        System.out.println("Playing "+song);
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of networks: ");
        String[] networkList={"Rutu","Sanyukta","Sans","Rishika","Jeet"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to "+network);
    }
    public void show()
    {
        System.out.println("Heyyyy!!");
    }
}
public class Interface {
    public static void main(String[] args){
        SmartPhone sp=new SmartPhone();

        /*sp.music("agar tum sath ho..");
        sp.call();
        sp.pickCall();
        sp.sms("Fuck off Kartik");
        sp.takeSnap();
        sp.recordVideo();
        sp.location(45,78);
        String ar[]=sp.getNetworks() ;
        for(String item: ar){
            System.out.println(item);
        }
        sp.connectToNetwork("Rishika");*/
        sp.record4kVideo();
        sp.show();
        CellPhone cp=new CellPhone();
        cp.call();
        cp.pickCall();
        cp.sms("Heyyya");

        CellPhone p=new SmartPhone();
        //p.takeSnap(); //not allowed
        p.sms("How are u?");

        Camera cam=new SmartPhone(); //this is a smartphone but please
        //use it as a camera only.Using functions of other interface or
        //class is not allowed. So, we can't use it as a wifi or music player
        // or gps
        cam.record4kVideo();
        cam.takeSnap();
        cam.recordVideo();
       // cam.show(); // not allowed (tumhe camera diya na toh tum usse bas camera ke
        //kam ke liye use karo. smart phone ki  khudke n baki functions use
        // karne ki liye nahi,samjha.)
       // cam.getNetworks(); not allowed
    }
}
