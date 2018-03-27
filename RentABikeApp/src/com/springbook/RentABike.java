package com.springbook;

import java.util.*;

public interface RentABike {
    String getStoreName();
    List getBikes();
    Bike getBike(String serialNo);
}