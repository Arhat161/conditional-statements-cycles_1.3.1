import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Пожалуйста, укажите ГОД в формате xxxx : ");
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println("Год високосный!");
        } else if (year % 100 == 0) {
            System.out.println("Год НЕ високосный!");
        } else {
            if (year % 4 == 0) {
                System.out.println("Год високосный!");
            } else {
                System.out.println("Год НЕ високосный!");
            }
        }
        scan.close();
    }
}