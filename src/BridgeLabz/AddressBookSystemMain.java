package BridgeLabz;

public class AddressBookSystemMain {
    public static void main(String[] args) {

        System.out.println("Welcome to address book system using collection");

        AddressBookSystemDetails details = new AddressBookSystemDetails();

        details.addDetails();
        details.display();
    }
}
