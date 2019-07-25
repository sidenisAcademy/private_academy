package REST_testing.Kutsenko.PetStore.PetSteps;

import REST_testing.Kutsenko.PetStore.PetControllers.UserController;

public class UserSteps {

    public static void stepUserLogin(String login, String password) {

        UserController.userLogin(login, password);

    }

    public static void stepUserLoginWithAuthBasic(String login, String password) {

        UserController.userAuth(login, password);

    }

}
