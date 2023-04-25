package SolidPrinciple.OpenClosed;

public class MobileService implements NotificationService{
    @Override
    public void sendMail(String medium) {
        if(medium.equals("mobile")){
            //operation to send email through mobile
        }
    }
}
