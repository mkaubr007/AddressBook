package com.biz.address.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook  {
    Scanner s=new Scanner(System.in);
    ArrayList<Contacts> contacts=new ArrayList<Contacts>();
    public void add(){
        Contacts contacts=new Contacts();
        if (!contacts.equals(contacts.getFirstName())) {
            System.out.println("enter first name");
            String firstName = s.next();
            contacts.setFirstName(firstName);
            System.out.println("enter last name");
            String lastName = s.next();
            contacts.setLastName(lastName);
            System.out.println("enter address ");
            String address = s.next();
            contacts.setAddress(address);
            System.out.println("enter city");
            String city = s.next();
            contacts.setCity(city);
            System.out.println("enter state");
            String state = s.next();
            contacts.setState(state);
            System.out.println("enter zip");
            String zip = s.next();
            contacts.setZip(zip);
            System.out.println("enter phone number");
            String phoneNumber = s.next();
            contacts.setPhoneNumber(phoneNumber);
        }else {
            System.out.println("Duplicate contact");
        }
    }
    public void edit() {
        System.out.println("Enter your First name:");
        String firstName = s.next();

        Iterator<Contacts> iterator = contacts.listIterator();

        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Address\t3.City\t4.State\t5. Zip\6.Phone Number\7.Email");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        contacts.setLastName(s.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Address");
                        contacts.setAddress(s.next());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        contacts.setCity(s.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your State");
                        contacts.setState(s.next());
                        break;
                    case 5:
                        System.out.println("Re-Correct your Zip");
                        contacts.setZip(s.next());
                        break;
                    case 6:
                        System.out.println("Re-Correct your Phone Number");
                        contacts.setPhoneNumber(s.next());
                        break;
                    case 7:
                        System.out.println("Re-Correct your Email");
                        contacts.setEmail(s.next());
                        break;
                    default:
                        System.out.println("Invalid input");
                }

            }
        }
    }
    public void delete() {
        System.out.println("Enter your First name:");
        String firstName = s.next();

        Iterator<Contacts> iterator = contacts.listIterator();
        while (iterator.hasNext()) {
            Contacts contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                contacts.remove(contacts);
            }
        }
    }
    public void operation() {
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out
                    .println("1. Add\t2. Edit\t3. Delete");
            switch (s.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while (status);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook=new AddressBook();
        Contacts contacts=new Contacts();
        addressBook.operation();

    }
}
