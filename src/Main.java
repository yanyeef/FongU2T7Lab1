import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String one = scan.nextLine();
        System.out.println("The length of your string is: " +one.length());

        int half = one.length()/2;
        System.out.println("The first half of the string is: " + one.substring(0,half));
        System.out.println("The second half of your string is: " + one.substring(half));

        System.out.println("Enter another string: ");
        String two = scan.nextLine();

        int oneLen = one.length();
        int twoLen = two.length();
        if (twoLen > oneLen) {
            System.out.println(two + "is longer than " + one);
        } else if (oneLen> twoLen) {
            System.out.println(one + " is longer than " + two);
        } else {
            System.out.println(one + " is equal in length to " + two);
        }

        if (oneLen== twoLen) {
            if (one.compareTo(two) < 0) {
                System.out.println(two + "comes before" + one);
            } else if (one.compareTo(two) ==0) {
                System.out.println(two + " and " + one+ " are the same words.");
            } else {
                System.out.println(one + "comes before" + two);
            }
        }

        int indexOfTwo = one.indexOf(two);
        if (indexOfTwo != -1) {
            System.out.println(two + " is found in " + one + " at index " + indexOfTwo);
        } else {
            System.out.println(two + " is not found in " + one);
        }

    }
}