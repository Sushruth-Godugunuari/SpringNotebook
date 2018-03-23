package com.springbook;

import java.util.*;

public class RentABike {
    private String storeName;
    final List<Bike> bikes = new ArrayList<Bike>();

    public RentABike(String storeName) {
        this.storeName = storeName;
        bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Fair"));
        bikes.add(new Bike("Cannondale", "F2000 XTR", 18, "22222", 12, "Fair"));
        bikes.add(new Bike("Shimano", "Roadmaster", 29, "33333", 12.4, "Fair"));
    }

    public String toString() {
        return "RentABike: " + storeName;
    }

    public List getBikes() {
        return bikes;
    }

    public Bike getBike(String serialNo) {
        Iterator iter = bikes.iterator();
        while (iter.hasNext()) {
            Bike bike = (Bike)iter.next();
            if(serialNo.equals(bike.getSerialNo())) return bike;
        }
        return null;
    }
}