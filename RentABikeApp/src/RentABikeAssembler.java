package com.springbook;

public class RentABikeAssembler {
    public static void main (String[] args) {
        CommandLineView cv = new CommandLineView();
        RentABike rentaBike = new ArrayListRentABike("Bruce's Bikes");
        cv.setRentaBike(rentaBike);
        cv.printAllBikes();
    }
}