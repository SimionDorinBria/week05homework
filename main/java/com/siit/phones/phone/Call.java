package main.java.com.siit.phones.phone;

public class Call {
    private int number;

    public Call() {
    }

    public Call(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Call{" +
                "number=" + number +
                '}';
    }
}
