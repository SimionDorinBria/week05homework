package main.java.com.siit.phones;


import main.java.com.siit.phones.models.SamsungGalaxy6;
import main.java.com.siit.phones.phone.Phone;

import static main.java.com.siit.phones.utils.AppConstants.ALUMINUM_MATERIAL;
import static main.java.com.siit.phones.utils.AppConstants.RED_COLOR;

/**
 * Java OOP
 * NOTE:
 * Homework must be posted on GitHub and the commit id shoud be submitted.
 * <p>
 * Requirements
 * <p>
 * All phones offer the following behavior:
 * - you can create new contacts
 * - you can see existing contacts
 * - you can send a text message
 * - you can see all messages for a specific contact
 * - you can make a call
 * - you can see all calls history
 * <p>
 * <p>
 * Implement a Phone hierarchy where:
 * - A Phone can be of certain manufacters and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
 * - properties wich cannot change: battery life (in number of hours)
 * - properties that are configurable: color, material
 * - properties that are instance specific: imei
 * <p>
 * Behavior:
 * - a message can have maximum 500 chars
 * - every time a message is send an hour is taken from the battery life
 * - every time a call is made two hours are taken from the battery life
 * <p>
 * API:
 * Phone Phone= new Samsung(); // shouldn't compile
 * Phone Phone = new SamsungGalaxy6();
 * <p>
 * Phone.addContact("1", "Phone number", "fist name", "last name");
 * Phone.addContact("2", "Phone number", "fist name", "last name");
 * Phone.listContacts();
 * <p>
 * // send a message to the first contact from the previous listed
 * // max number of characters - 100
 * Phone.sendMessage("Phone number", "message content");
 * Phone.listMessages("Phone number");
 * <p>
 * // send a message to the second contact from the previous listed
 * Phone.call("Phone number");
 * Phone.viewHistory();
 * <p>
 * Tasks:
 * - implement the classes, abstract classes and interfaces according to the given information
 * - create at least 2 Phone brands with 2 models for each
 * - create 2 new contacts
 * - send a message to the first contact
 * - make a call to the second contact
 */
public class Main {
    public static void main(String[] args) {
        Phone samsung1 = new SamsungGalaxy6(RED_COLOR, ALUMINUM_MATERIAL, "123456", null,
                null, null);
        samsung1.addContact("1", "111", "Albert", "Einstein");
        samsung1.addContact("2", "222", "Papura", "Voda");
        samsung1.listContacts();

        samsung1.sendMessage(111, "Yesterday, we reached Type 3 civilization status " +
                "on Kardashev scale");
        samsung1.listMessages(111);

        samsung1.call(222);
        samsung1.viewHistory();
    }
}

