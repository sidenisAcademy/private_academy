package Isabekov;

    public class Tax {
        double grossIncome;
        String city;

        public double calcTax() {
            return grossIncome * 0.13;
        }
    }