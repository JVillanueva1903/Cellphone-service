package com.pluralsight;

public class CellPhone2 {
}
import java.util.Scanner;

public class Main {
    public static void main(Main.String[] args) {

        Scanner input = new Scanner(Main.System.in);

        // Create a new CellPhone with no starter data
        CellPhone phone = new CellPhone();

        // Prompt user for phone information
        System.out.print("Enter the phone brand: ");
        phone.setBrand(input.nextLine());

        System.out.print("Enter the phone model: ");
        phone.setModel(input.nextLine());

        System.out.print("Enter the storage amount (GB): ");
        phone.setStorage(input.nextInt());

        System.out.print("Enter the price: ");
        phone.setPrice(input.nextDouble());

        System.out.println();
        phone.displayInfo();

        input.close();
    }

    private static class String {
    }

    private static class Scanner {
        public java.lang.Object nextLine() {


        }

        public java.lang.Object nextDouble() {


        }

        public java.lang.Object nextInt() {


        }

        public void close() {

        }
    }

    private static class System {
        public static java.lang.Object out
                ;
    }
}