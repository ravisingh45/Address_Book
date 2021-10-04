package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
      AddressBookMain detail = new AddressBookMain();
        Scanner scanner = new Scanner(System.in);
      boolean display = true;
      while (display){
          System.out.println("choose the option");
          System.out.println("1 Add details.\\n2 Edit details. \\n3 display all. \\n4 Exit.");
          int choose = scanner.nextInt();
          switch (choose){
              case 1:
                  detail.addDetail();
                  break;
              case 2:
                  detail.editDetails();
                  break;
              case 3:
                  detail.Display_All(detail.contactDetailList);
                  break;
              case 4:
                  display = false;
                  break;
              default:
                  break;

          }
      }
    }
}