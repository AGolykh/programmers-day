import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (((year % 400) == 0) || (((year % 100) != 0) & ((year % 4) == 0))) {    // Если делится на 400 без остатка или не делится на 100 без остатка, но делится на 4
            return true;
        } else {
            return false;
        }
    }
}
