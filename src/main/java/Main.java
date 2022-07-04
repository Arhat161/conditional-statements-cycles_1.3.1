import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input YEAR in format xxxx : ");
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println("Not a leap year!");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year!");
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap year!");
            } else {
                System.out.println("Not a leap year!");
            }
        }
        scan.close();
    }
}