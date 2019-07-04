package main.java.com.siit.phones.phone;

import main.java.com.siit.phones.phone.Call;
import main.java.com.siit.phones.phone.Contact;
import main.java.com.siit.phones.phone.Message;
import main.java.com.siit.phones.phone.Phone;

import java.util.ArrayList;
import java.util.List;

public abstract class PhoneModel implements Phone {
    private String manufacturer;
    private int batteryLifeInHours;
    private String color;
    private String material;
    private String imei;
    private List <Contact> contacts;
    private List <Message> messages;
    private List <Call> calls;

    public PhoneModel() {
    }

    public PhoneModel(String manufacturer, int batteryLifeInHours, String color, String material,
                      String imei, List<Contact> contacts, List<Message> messages,
                      List<Call> calls) {
        this.manufacturer = manufacturer;
        this.batteryLifeInHours = batteryLifeInHours;
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.contacts = new ArrayList<Contact>();
        this.messages = new ArrayList<Message>();
        this.calls = new ArrayList<Call>();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBatteryLifeInHours() {
        return batteryLifeInHours;
    }

    public void setBatteryLifeInHours(int batteryLifeInHours) {
        this.batteryLifeInHours = batteryLifeInHours;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        contacts.add(new Contact(id, phoneNumber, firstName, lastName));

    }

    @Override
    public void listContacts() {
        System.out.print("Contacts: \n");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void sendMessage(int phoneNumber, String message) {
        if (message.length() < 500) {
            this.batteryLifeInHours -= 1;
            messages.add(new Message(phoneNumber, message));
        } else System.out.println("Message too long");
    }

    @Override
    public void listMessages(int phoneNumber) {
        System.out.println("\nMessages to " + phoneNumber + ": ");
        for (Message message : messages) {
            if (message.getNumber() == phoneNumber) {
                System.out.println(message);
            }
        }
    }

    @Override
    public void call(int number) {
        this.batteryLifeInHours -= 2;
        calls.add(new Call(number));
    }

    @Override
    public void viewHistory() {
        System.out.println("\nCalls: ");
        for (Call call : calls) {
            System.out.println(call);
        }
    }

    @Override
    public String toString() {
        return "PhoneModel{" +
                "batteryLifeInHours=" + batteryLifeInHours +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", imei='" + imei + '\'' +
                ", contacts=" + contacts +
                ", messages=" + messages +
                ", calls=" + calls +
                '}';
    }
}