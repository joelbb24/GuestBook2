package com.company;

import java.util.Scanner;

public class GuestMain {

    public void printMenu() {
        System.out.println("_________Welcome to GuestBook App_________");
        System.out.println("Choose an option");
        System.out.println("1. Add new Guest");
        System.out.println("2. Print Guest by ID");
        System.out.println("3. Search and print guest by name");
        System.out.println("4. Remove guest");
        System.out.println("5. Print the Guest List");
        System.out.println("0. Exit");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuestApp gApp = new GuestApp();
        Guest g = new Guest();

        GuestMain gm = new GuestMain();
        gm.printMenu();

        int choice = sc.nextInt();

        while(choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter phone number: ");
                    sc.nextLine();
                    String phone = sc.nextLine();

                    gApp.addGuest(g.getGuestId(), name, phone, age);
                    break;

                case 2:
                    System.out.println("Enter Guest ID");
                    int input = sc.nextInt();
                    gApp.printGuest(input);
                    break;

                case 3:
                    System.out.println("Enter a name to search : ");
                    sc.nextLine();
                    String inputName = sc.nextLine();
                    gApp.printGuestByName(inputName);
                    break;

                case 4:
                    System.out.println("Enter a guestId to deleted: ");
                    int inp = sc.nextInt();
                    gApp.deleteGuest(inp);
                    break;

                case 5:
                    gApp.printAllGuests();
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;

            }
            gm.printMenu();
            choice = sc.nextInt();
        }
    }
}
