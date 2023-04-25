package SolidPrinciple.OpenClosed;

public class LaptopService implements NotificationService{
    @Override
    public void sendMail(String medium) {
        if(medium.equals("laptop")){
            //operation to send email through laptop
        }
    }
}
