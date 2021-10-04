package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    //Taking all the variable as privet
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipNumber;
    private String phoneNumber;
    private String email;

    // using getter and setter of for taking the value from privet
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipNumber() {
        return zipNumber;
    }

    public void setZipNumber(String zipNumber) {
        this.zipNumber = zipNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return '\n' + "Contact is" + '\n' + "First Name :: " + firstName + '\n' + "Last  Name :: " + lastName + '\n'
                + "City : " + city + '\n' + "State :: " + state + "zip :: " + zipNumber + '\n' + "Phone Number :: "
                + phoneNumber + '\n' + "Email Id :: " + email + '\n';

    }
}
    class AddressBookMain {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contactDetailList = new ArrayList<>();
        public void addDetail() {
            // using scanner to scan all the value of variable and adding the details.
            Contact details = new Contact();
            System.out.println("Add person Deatils");
            System.out.print("Enter First Name :: ");
            details.setFirstName(scanner.next());
            System.out.print("Enter Last Name :: ");
            details.setLastName(scanner.next());
            System.out.print("Enter City :: ");
            details.setCity(scanner.next());
            System.out.print("Enter State :: ");
            details.setState(scanner.next());
            System.out.print("Enter pinCode :: ");
            details.setZipNumber(scanner.next());
            System.out.print("Enter mobNumber :: ");
            details.setPhoneNumber(scanner.next());
            System.out.print("Enter Email ID :: ");
            details.setEmail(scanner.next());
            contactDetailList.add(details);

        }
        public void Display_All(ArrayList<Contact> arr) {
            boolean is_Empty = arr.isEmpty();
            if (is_Empty == true)
                System.out.println("Array List is Empty");
            else
                System.out.println(arr);
        }
    }
