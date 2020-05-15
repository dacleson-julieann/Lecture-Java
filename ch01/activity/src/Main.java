/* Obtaining the minimum of two numbers
* Write a program that will check two number entered as variables and print out the
* message "The minimum of numbers: XX and YY is ZZ", where XX, YY, and ZZ represent
* the values of the two variables and the result of the operation, respectively. To
* do this, perform the following steps:
* 1. Declare 3 double variables: a, b, and m. Initialize them with the values 3,4,
* and 0 respectively.
* 2. Create a String variable r, it should contain the output message to be printed.
* 3. Use the min() method to obtain the minimum of the two numbers and store the
* value in m.
* 4. Print the results. */

public class Main {
    public static void main(String[] args) {
        double a = 5, b = 2, m = 0, n = 0;
        m = Math.min(a,b);
        System.out.print("The minimum of 5 and 2 is: ");
        System.out.println(m);

        n = Math.max(a,b);
        System.out.print("The maximum of 5 and 2 is: ");
        System.out.println(n);
    }
}
