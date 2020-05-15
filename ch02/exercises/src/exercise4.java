public class exercise4 {
    public static void main(String[] args) {
        /* int speed = 50;
        int maxSpeed = 60;
        int speedForFine = 70;

        if (speed > maxSpeed) {
            System.out.println("Your speed is greater than the max. speed limit!");
        } else if (speed < maxSpeed) {
            System.out.println("Your speed is lees than the max. speed limit!");
        } else {
            System.out.println("Your speed is equal to the max. speed limit!");
        } */

        int smallDiscount = 0;
        int mediumDiscount = 10;
        int largeDiscount = 15;
        int mediumThreshold = 5;
        int largeThreshold = 50;
        int purchaseAmount = 40;

        if (purchaseAmount >= largeThreshold) {
            System.out.println("you get a discount of " + largeDiscount + "%");
        } else if (purchaseAmount >= mediumThreshold) {
            System.out.println("You get a discount of " + mediumDiscount + "%");
        } else {
            System.out.println("You get a discount of " + smallDiscount + "%");
        }
    }
}
