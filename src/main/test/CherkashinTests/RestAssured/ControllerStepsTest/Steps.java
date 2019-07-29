package CherkashinTests.RestAssured.ControllerStepsTest;

public class Steps {
    public Integer id = 667;

    public String steps() {
        String JSON;
        JSON = "{ \"id\": 667, \"category\": { \"id\": 667, \"name\": \"Ivan\" }, \"name\": \"Pes\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}";
        return (JSON);
    }

    public void result() {
        String json = steps();
        Controller pet = new Controller();
        pet.PostPet(json);
        pet.GetPet(id);
        pet.DelPet(id);
        pet.GetDeletedPet(id);
    }
}