class Computer7 {
    @Deprecated
    public void whatIsIt() {
        System.out.println( "it is a PC");
    }
    public void getDeviceType() {
        System.out.println( "it is a PC");
    }
}
class Tablet5 extends Computer7 {
    @Override
    public void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}
public class exercise13 {
    public static void main(String[] args) {
        Tablet5 myTab = new Tablet5();
        myTab.whatIsIt();
    }
}
