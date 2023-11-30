package Observer_Pattern.Store;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EmailMsgListener> customers;

    public NotificationService(){
        customers = new ArrayList<>();
    }
    public void subscribe(EmailMsgListener listener){
        customers.add(listener);
    }
    public void unsubscribe(EmailMsgListener listener){
        customers.remove(listener);
    }
    public void notiffy() {
        customers.forEach(listener -> listener.update());
    }
}
