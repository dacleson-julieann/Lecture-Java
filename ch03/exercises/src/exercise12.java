class Computer6 {
    public void whatIsIt() {
        System.out.println( "it is a PC");
    }
}
class Tablet4 extends Computer6 {
    @Override
    public void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}
public class exercise12 {
    public static void main(String[] args) {
        Tablet4 myTab = new Tablet4();
        myTab.whatIsIt();
    }
}
