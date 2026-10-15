public class accountInfo {
    private String accountName; //Ім'я облікового запису
    private int followersNumber; // Кількість підписників
    private int followersFollowing; // Кількість підписок

    public accountInfo ( //Конструктор
            String accountName,
            int followerNumber,
            int followersFollowing) {
        this.accountName = accountName;
        this.followersNumber = followerNumber;
        this.followersFollowing = followersFollowing;
    }
    //Отримуємо значення
    public int getFollowers() {
        return followersNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public int getFollowersFollowing() {
        return followersFollowing;
    }
}
//Інтерфейс (Наприклад: оповіщення оновлення)
public interface NotificationUpdate {
    void sendNotification(String messageInfo);
}



public static void main(String[] args) {
    NormalAccount account = new NormalAccount("appetizer340");
    account.showName();
}