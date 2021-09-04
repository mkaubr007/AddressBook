package com.biz.address.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contacts {
    Scanner s=new Scanner(System.in);
    ArrayList<Contacts> contacts=new ArrayList<Contacts>();
    public void add(){
        Contacts contacts=new Contacts();
        System.out.println("enter first name");
        String firstName=s.next();
        contacts.setFirstName(firstName);
        System.out.println("enter last name");
        String lastName=s.next();
        contacts.setLastName(lastName);
        System.out.println("enter address ");
        String address=s.next();
        contacts.setAddress(address);
        System.out.println("enter city");
        String city=s.next();
        contacts.setCity(city);
        System.out.println("enter state");
        String state=s.next();
        contacts.setState(state);
        System.out.println("enter zip");
        String zip=s.next();
        contacts.setZip(zip);
        System.out.println("enter phone number");
        String phoneNumber=s.next();
        contacts.setPhoneNumber(phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook=new AddressBook();
        addressBook.add();
    }
}
