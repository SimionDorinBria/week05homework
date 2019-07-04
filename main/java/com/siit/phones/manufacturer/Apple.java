package main.java.com.siit.phones.manufacturer;

import main.java.com.siit.phones.phone.Call;
import main.java.com.siit.phones.phone.Contact;
import main.java.com.siit.phones.phone.Message;
import main.java.com.siit.phones.phone.PhoneModel;

import java.util.List;

import static main.java.com.siit.phones.utils.AppConstants.APPLE_MANUFACTURER;

public abstract class Apple extends PhoneModel {
    public Apple() {
    }

    public Apple(int batteryLifeInHours, String color, String material,
                 String imei, List<Contact> contacts, List<Message> messages,
                 List<Call> calls) {
        super(APPLE_MANUFACTURER, batteryLifeInHours, color, material, imei, contacts, messages, calls);
    }

}
