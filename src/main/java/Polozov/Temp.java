package Polozov;

import java.util.Objects;

public class Temp {
    public int testOne;
    public String testTwo;

    @Override
    public String toString() {
        return "Temp{" +
                "testOne=" + testOne + "\n" +
                ", testTwo='" + testTwo + '\'' + "\n" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temp temp = (Temp) o;
        return testOne == temp.testOne &&
                Objects.equals(testTwo, temp.testTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testOne, testTwo);
    }
}
