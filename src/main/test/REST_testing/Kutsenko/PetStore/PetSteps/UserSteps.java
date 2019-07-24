package REST_testing.Kutsenko.PetStore.PetSteps;

import REST_testing.Kutsenko.PetStore.PetControllers.UserController;

public class UserSteps {

    public static void stepUserLogin(String login, String password) {

        String resp = UserController.userLogin(login, password);
        System.out.println(resp);

    }

    public static void stepUserLoginWithAuthBasic(String login, String password) {

        String resp = UserController.userAuth(login, password);
        System.out.println(resp);

    }

}