package Observer_Pattern.Store;

import java.util.EventListener;

public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email){
        this.email = email;
    }
    public void update(){
        //Actually send the mail
    }
}
