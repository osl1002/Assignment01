package cse360assignment02;

public class AddingMachine {

    private int total;
    private String history;

    public AddingMachine() {
        total = 0;
        history = "0";
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        total += value;
        history += " + " + value;
    }

    public void subtract(int value) {
        total -= value;
        history += " - " + value;
    }

    public void multiply(int value) {
        total *= value;
        history += " * " + value;
    }

    public void divide(int value) {
        total /= value;
        history += " / " + value;
    }

    public String getHistory() {
        return history;
    }
}
