package main.java.com.siit.phones.manufacturer;

import main.java.com.siit.phones.phone.Call;
import main.java.com.siit.phones.phone.Contact;
import main.java.com.siit.phones.phone.Message;
import main.java.com.siit.phones.phone.PhoneModel;

import java.util.List;

import static main.java.com.siit.phones.utils.AppConstants.SAMSUNG_MANUFACTURER;

public abstract class Samsung extends PhoneModel {
    public Samsung() {
    }

    public Samsung(int batteryLifeInHours, String color, String material,
                   String imei, List<Contact> contacts, List<Message> messages,
                   List<Call> calls) {
        super(SAMSUNG_MANUFACTURER, batteryLifeInHours, color, material, imei, contacts, messages, calls);
    }

}
