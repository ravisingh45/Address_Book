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

        public void editDetails() {
            //
            System.out.println("Confirm your First name");
            String confirm_Name = scanner.next();
            for(int i =0; i <contactDetailList.size();i++){
                if (contactDetailList.get(i).getFirstName().equals(confirm_Name)) {
                    System.out.println("select the option for edit: ");
                    System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                    int edit = scanner.nextInt();
                    switch (edit){
                        case 1:
                            System.out.println("enter the  new first name");
                            contactDetailList.get(i).setFirstName(scanner.next());
                            break;
                        case 2:
                            System.out.println("enter the new last name");
                            contactDetailList.get(i).setLastName(scanner.next());
                            break;
                        case 3:
                            System.out.println("enter the new address");
                            contactDetailList.get(i).setAddress(scanner.next());
                            break;
                        case 4:
                            System.out.println("enter the  new city name");
                            contactDetailList.get(i).setCity(scanner.next());
                             break;
                        case 5:
                            System.out.println("enter the state name");
                            contactDetailList.get(i).setState(scanner.next());
                            break;
                        case 6:
                            System.out.println("enter the new Zipnumber ");
                            contactDetailList.get(i).setZipNumber(scanner.next());
                            break;
                        case 7:
                            System.out.println("enter the new phone number");
                            contactDetailList.get(i).setPhoneNumber(scanner.next());
                            break;
                        case 8:
                            System.out.println("enter the new email id");
                            contactDetailList.get(i).setEmail(scanner.next());
                            break;
                    }
                    System.out.println("Edited list is: ");
                    System.out.println(contactDetailList);
                }
                else
                    System.out.println("enter the valid input");
            }
        }

        public void Display_All(ArrayList<Contact> arr) {
            boolean is_Empty = arr.isEmpty();
            if (is_Empty == true)
                System.out.println("Array List is Empty");
            else
                System.out.println(arr);
        }
    }
