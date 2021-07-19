package addressbookcollection;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    static Scanner scanner = new Scanner(System.in);
    private static Object addContact;

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Press 1. Addcontact");
            System.out.println("Press 2. Edit contact");
            System.out.println("Press 3. Delete contact");
            System.out.println("Press 4. To end");

            int check = scanner.nextInt();
            switch (check) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public static void deleteContact() {
        Contact contact = new Contact();
        ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

        System.out.print("Enter first Name:: ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.print("Enter last Name:: ");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        for (int i=0; i<contactArrayList.size(); i++)
        {
            if (contactArrayList.get(i).getFirstName().equals(firstName) && contactArrayList.get(i).getLastName().equals(lastName))
            {
                contactArrayList.remove(i);
            }
        }
        System.out.println("********* Deleted Contact Successfully *********");
    }

    private static void editContact() {
        Contact contact = new Contact();
        ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
        System.out.print("Enter a first name: ");
        String firstName = scanner.next();
        System.out.print("Enter a last name: ");
        String lastName = scanner.next();
        for (int i = 0; i <contactArrayList.size(); i++)
        {
            if (contactArrayList.get(i).getFirstName().equals(firstName) && contactArrayList.get(i).getLastName().equals(lastName)) {
                System.out.print("Enter address: ");
                String address = scanner.next();
                contact.setAddress(address);

                System.out.print("Enter city: ");
                String city = scanner.next();
                contact.setCity(city);

                System.out.print("Enter state: ");
                String state = scanner.next();
                contact.setState(state);

                System.out.print("Enter zip: ");
                long zip = scanner.nextLong();
                contact.setZipCode(zip);

                System.out.print("Enter phone no: ");
                long phNumber = scanner.nextLong();
                contact.setMobileNumber(phNumber);

                System.out.print("Enter email: ");
                String email = scanner.next();
                contact.setEmail(email);

                System.out.println("********* Edited Contact Successfully *********");

            }
        }
    }



    private static void addContact() {
        Contact contact = new Contact();

        System.out.print("Enter first Name:: ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.print("Enter last Name:: ");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.print("Enter address:: ");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.print("Enter city Name:: ");
        String city = scanner.next();
        contact.setCity(city);

        System.out.print("Enter State Name:: ");
        String state = scanner.next();
        contact.setState(state);

        System.out.print("Enter Email :: ");
        String email = scanner.next();
        contact.setEmail(email);

        System.out.print("Enter zip Code:: ");
        int zipCode = scanner.nextInt();
        contact.setZipCode(zipCode);

        System.out.print("Enter Mobile Number:: ");
        long mobileNumber = scanner.nextLong();
        contact.setMobileNumber(mobileNumber);

        System.out.println("********* Added Contact Successfully *********");

        printContact(firstName,lastName,address,city,state,email,zipCode,mobileNumber);
    }

    private static void printContact(String firstName, String lastName, String address, String city, String state, String email, int zipCode, long mobileNumber) {
        System.out.println("\nFirst name::" +firstName+ "\nLast name::" +lastName+ "\nCity::" +city+ "\nState::" +state+ "\nEmail::" +email+ "\nzip code::" +zipCode+ "\nMobile number::" +mobileNumber);
    }

}
