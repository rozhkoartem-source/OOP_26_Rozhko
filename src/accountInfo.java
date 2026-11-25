public class accountInfo {
    String accountName;
    int accountId;
    int accountBalance;
    String accountLocation;
    int dayTime;
    int monthTime;
    int yearTime;

    public accountInfo(String accountName, int accountId, int accountBalance, String accountLocation,
                        int dayTime, int monthTime, int yearTime) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.accountLocation = accountLocation;
        this.dayTime = dayTime;
        this.monthTime = monthTime;
        this.yearTime = yearTime;
    }

    void showStatus() {
        System.out.println("Аккаунт: " + accountName);
        System.out.println("Айді: " + accountId);
        System.out.println("Гаманець: " + accountBalance);
        System.out.println("Регіон: " + accountLocation);
        System.out.println("Створено: " + dayTime + "."+ monthTime + "." + yearTime);
    }

    void showAccountStatus() {
        System.out.println("Статус: None");
        System.out.println("Можливості: Limited");
    }
}