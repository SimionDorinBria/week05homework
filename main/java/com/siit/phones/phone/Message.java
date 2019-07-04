package main.java.com.siit.phones.phone;

public class Message {
    private int number;
    private String message;

    public Message() {
    }

    public Message(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "number=" + number +
                ", message='" + message + '\'' +
                '}';
    }
}
