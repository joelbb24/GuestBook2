package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestApp {

    List<Guest> guests =  new ArrayList<Guest>();

    public void addGuest(int guestId, String name, String phone, int age) {
        if(name.length()>2 && phone.length()>9 && age>18) {
            guests.add(new Guest(name, phone, age));
        }
    }

    public void printGuest(int input){
        if(guests.contains(input));
    }


}
