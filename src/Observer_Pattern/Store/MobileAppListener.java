package Observer_Pattern.Store;

import java.util.EventListener;
public class MobileAppListener implements EventListener, Observer_Pattern.Store.EventListener {
    private final String username;

    public MobileAppListener(String username){
        this.username = username;

    }

    @Override
    public void update(){
        //Actually send the push notification
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().subscribe(
                new EmailMsgListener("cliqueshoppa@gmail.com")
        );
        new EmailMsgListener("cliqueshoppa@gmail.com")
        );
    }
}

}
