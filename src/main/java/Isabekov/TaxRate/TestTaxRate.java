package Isabekov.TaxRate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class TestTaxRate {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        TaxRate taxRate = new TaxRate();

        taxRate.city = "Tomsk";
        taxRate.cityId = 123;
        taxRate.taxRate = 13.33;

//        objectMapper.writeValue(new File("target/taxRate.json"), taxRate);
//        String taxRateString = 	objectMapper.writeValueAsString(taxRate);
//        System.out.println(taxRateString);

        TaxRate taxRateFromJson = objectMapper.readValue(new File("target/taxRate.json"), TaxRate.class);
        System.out.println(taxRateFromJson.city);
    }
//             for(TaxRate temp :info.taxRates) {
//             if (temp.city.equals("Tomsk")) {
//                tomsk = temp;
//            }
//        }
//    System.out.println(tomsk.taxRate); // 13.33
}
