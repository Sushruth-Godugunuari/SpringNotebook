package com.springbook;

import java.util.*;

public class CommandLineView {
    private RentABike rentaBike;

    public CommandLineView() {
    }

    public void setRentaBike(RentABike rentaBike) {
        this.rentaBike = rentaBike;
    }

    public RentABike getRentaBike() {
        return this.rentaBike;
    }

    public void printAllBikes() {
        System.out.println(rentaBike.toString());
        Iterator iter = rentaBike.getBikes().iterator();
        while (iter.hasNext()) {
            Bike bike = (Bike)iter.next();
            System.out.println(bike.toString());
        }
    }

    public static final void main(String[] args) {
        CommandLineView clv = new CommandLineView();
        clv.printAllBikes();
    }
}