import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);

        System.out.println("Contact added successfully.");
    }

    public void editContact() {
        System.out.print("Enter first name of contact to edit: ");
        String name = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.print("Enter New Address: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter New City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter New State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter New Zip: ");
                contact.setZip(scanner.nextLine());

                System.out.print("Enter New Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter New Email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully.");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    public void deleteContact() {
        System.out.print("Enter first name of contact to delete: ");
        String name = scanner.nextLine();

        boolean removed = contacts.removeIf(contact ->
                contact.getFirstName().equalsIgnoreCase(name)
        );

        if (removed) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
            System.out.println("----------------------");
        }
    }
}