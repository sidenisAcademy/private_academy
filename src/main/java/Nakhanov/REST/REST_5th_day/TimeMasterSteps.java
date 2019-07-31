package Nakhanov.REST.REST_5th_day;

public class TimeMasterSteps {

    public void whoAmITimeMasterStep(){
        System.out.println(TimeMasterController.getWhoAmIController());
    }

    public void getInfoForCurrentUserStep(){
        System.out.println(TimeMasterController.getInfoForCurrentUserController());
    }

    public void putCommentStep(){
        TimeMasterController.putCommentController();
    }
}
