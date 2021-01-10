package com.moh;

public class Account {
    private int number;
    private int number2;

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public Account(int number) {
        this.setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + getNumber() +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
