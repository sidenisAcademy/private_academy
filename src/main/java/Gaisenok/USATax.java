package Gaisenok;

public class USATax extends Tax {
    int dependents;

    public double calcTax() {
        if (grossIncome <= 500000) {
            return (grossIncome * 0.06);
        } else if (grossIncome > 500000 && dependents <= 2) {
            return (grossIncome * 0.10);
        } else
            return (grossIncome * 0.08);
    }
    void calcTax(double taxPercentage, String cityName) {
        System.out.println(taxPercentage +" in "+ cityName);
    }
    void calcTax(double taxPercentage, int cityCode) {
        System.out.println(taxPercentage +" in a city with zipcode "+ cityCode);
    }
    void calcTax(String cityName) {
        System.out.println(cityName);
    }
}
