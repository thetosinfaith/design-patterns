package Observer_Pattern.Store;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notiffy();
    }

    public NotificationService getService() {
        return notificationService;
    }

    public Object getNotificationService() {
        return null;
    }

}

