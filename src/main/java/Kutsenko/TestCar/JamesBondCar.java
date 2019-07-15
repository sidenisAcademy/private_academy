package Kutsenko.TestCar;

public class JamesBondCar extends Car {

    int currentSubmergeDepth;
    boolean isGunOnBoard = true;

    void submerge() {
        currentSubmergeDepth = 50;
    }

    void surface() {
        currentSubmergeDepth = 0;
    }
}
