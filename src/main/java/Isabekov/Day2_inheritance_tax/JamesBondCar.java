package Isabekov.Day2_inheritance_tax;

import Isabekov.DAY1.Car;

class JamesBondCar extends Car {
    int turbines;
    boolean JamesIstired;
    String display;
    int currentSubmergeDepth;

    void submerge() {
        currentSubmergeDepth = 50;
    }

    void surface() {
        currentSubmergeDepth = 0;
    }
}
