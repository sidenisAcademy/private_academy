package REST_testing.Kutsenko.SimpleServer.SSSteps;

import REST_testing.Kutsenko.SimpleServer.SSControllers.SSController;

public class SSSteps {

    public static void stepRegisterSimpleServer(String email, String password) {

        String resp = SSController.registerSimpleServer(email, password);
        System.out.println(resp);

    }

    public static String stepAuthSimpleServer(String email, String password) {

        return SSController.authSimpleServer(email, password);

    }

    public static void stepGetProtected(String token) {

        String msg = SSController.getProtected(token);
        System.out.println(msg);

    }
}
