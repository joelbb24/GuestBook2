package com.company;

public class Guest {
    private static int count = 0;
    private int guestId = 0;
    private String name;
    private String phone;
    private int age;

    public Guest(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.guestId = count++;
    }

    public Guest() {}

    public int getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
