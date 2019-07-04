package main.java.com.siit.phones.models;

import main.java.com.siit.phones.manufacturer.Apple;
import main.java.com.siit.phones.phone.Call;
import main.java.com.siit.phones.phone.Contact;
import main.java.com.siit.phones.phone.Message;

import java.util.List;

import static main.java.com.siit.phones.utils.AppConstants.TEN_HOURS;

public class AppleIphone2 extends Apple {
    public AppleIphone2() {
    }

    public AppleIphone2(String color, String material,
                        String imei, List<Contact> contacts, List<Message> messages,
                        List<Call> calls) {
        super(TEN_HOURS, color, material, imei, contacts, messages, calls);
    }
}
