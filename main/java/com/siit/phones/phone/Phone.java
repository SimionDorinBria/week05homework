package main.java.com.siit.phones.phone;

public interface Phone {
    void addContact(String id, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(int phoneNumber, String message);

    void listMessages(int phoneNumber);

    void call(int number);

    void viewHistory();
}
