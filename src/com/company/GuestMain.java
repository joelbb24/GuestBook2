package com.company;

import java.util.Scanner;

public class GuestMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuestApp gApp = new GuestApp();
        Guest g = new Guest();

        System.out.println("_________Welcome to GuestBook App_________");
        System.out.println("Choose an option");
        System.out.println("1. Add new Guest");
        System.out.println("2. Print Guest by ID");
        System.out.println("3. Search and print guest by name");
        System.out.println("4. Remove guest");
        System.out.println("5. Print the Guest List");
        System.out.println("0. Exit");

        int choice = sc.nextInt();

        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    int id = g.getGuestId();
                    System.out.println("Enter phone number: ");
                    String phone = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    gApp.addGuest(id, name, phone, age);

                case 2:
                    System.out.println("Enter Guest ID");
                    int input = sc.nextInt();
                    gApp.printGuest(input);
            }
        }
    }
}
