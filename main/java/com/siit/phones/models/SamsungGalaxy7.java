package main.java.com.siit.phones.models;

import main.java.com.siit.phones.manufacturer.Samsung;
import main.java.com.siit.phones.phone.Call;
import main.java.com.siit.phones.phone.Contact;
import main.java.com.siit.phones.phone.Message;

import java.util.List;

import static main.java.com.siit.phones.utils.AppConstants.ELEVEN_HOURS;

public class SamsungGalaxy7 extends Samsung {
    public SamsungGalaxy7() {
    }

    public SamsungGalaxy7(String color, String material,
                          String imei, List<Contact> contacts, List<Message> messages,
                          List<Call> calls) {
        super(ELEVEN_HOURS, color, material, imei, contacts, messages, calls);
    }
}
