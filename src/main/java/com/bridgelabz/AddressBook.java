package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first Name :");
        String firstName = scanner.next();
        System.out.println("enter the Last Name :");
        String lastName = scanner.next();
        System.out.println("enter the address :");
        String address = scanner.next();
        System.out.println("enter the city :");
        String city = scanner.next();
        System.out.println("enter the State :");
        String state = scanner.next();
        System.out.println("enter the zip Number ");
        int zip = scanner.nextInt();
        System.out.println("enter the Phone Number :");
        int phoneNumber = scanner.nextInt();
        System.out.println("enter the email:");
        String email = scanner.next();
    }
}