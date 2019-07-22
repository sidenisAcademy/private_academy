package Isabekov.TaxRate;
import java.util.Objects;

public class TaxRate {
    public String city;
    public int cityId;
    public Double taxRate;

    @Override
    public String toString() {
        return "TaxRate{" + "\n" +
                "  city='" + city + "\n" +
                "  cityId=" + cityId + "\n" +
                "  taxRate=" + taxRate + "\n" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxRate taxRate1 = (TaxRate) o;
        return cityId == taxRate1.cityId &&
                Objects.equals(city, taxRate1.city) &&
                Objects.equals(taxRate, taxRate1.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, cityId, taxRate);
    }

}
