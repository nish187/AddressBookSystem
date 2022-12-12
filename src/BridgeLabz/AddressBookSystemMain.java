package BridgeLabz;


import java.util.Scanner;

public class AddressBookSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system using collection");
        Scanner sc = new Scanner(System.in);

        AddressBookSystemDetails details = new AddressBookSystemDetails();

        int choice = 1;
        while (choice == 1) {
            System.out.println("Choose One of the Given Choices as per Requirement: ");
            System.out.println("1.Add Details\n2.Edit Details\n3.Display Details\n0.Exit");

            switch (sc.nextInt()) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.editDetails();
                    break;
                case 3:
                    details.display();
                    break;
                default:
                    choice = 0;
            }
        }
    }
}