package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GuestApp {

    List<Guest> guests =  new ArrayList<Guest>();




    public void addGuest(int guestId, String name, String phone, int age) {
            guests.add(guestId, new Guest(name, phone, age));
    }

    public void printGuest(int input){
            for(Guest gst: guests) {
                if(gst.getGuestId() == input) {
                    System.out.println("guestID: " + gst.getGuestId());
                    System.out.println("Name: " + gst.getName());
                    System.out.println("Phone : " + gst.getPhone());
                    System.out.println("Age : " + gst.getAge());
                }
            }
    }

    public void printGuestByName(String inputName) {
        for(Guest gst : guests) {
            if(gst.getName().equals(inputName)) {
                System.out.println("guestID: " + gst.getGuestId());
                System.out.println("Name: " + gst.getName());
                System.out.println("Phone : " + gst.getPhone());
                System.out.println("Age : " + gst.getAge());
            }
        }
    }

    public void deleteGuest (int inp) {
        guests.remove(inp);
    }

    public void printAllGuests() {
        for( Guest gst : guests) {
            System.out.println("guestID: " + gst.getGuestId());
            System.out.println("Name: " + gst.getName());
            System.out.println("Phone : " + gst.getPhone());
            System.out.println("Age : " + gst.getAge());
            System.out.println("___________________________________________________________");
        }
    }


}
