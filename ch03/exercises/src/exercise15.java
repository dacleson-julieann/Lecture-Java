interface Computer1a {
    public String getDeviceType();
    public String getSpeed();
}
class Tablet1a implements Computer1a {
    public String getDeviceType() {
        return "it is a tablet";
    }
    public String getSpeed() {
        return "1GHz";
    }
}
public class exercise15 {
    public static void main(String[] args) {
        Tablet1a myTab = new Tablet1a();
        System.out.println( myTab.getDeviceType() );
        System.out.println( myTab.getSpeed() );
    }
}
