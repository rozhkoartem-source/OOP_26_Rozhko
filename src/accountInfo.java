public class accountInfo {
    String accountName;
    int accountId;
    int accountBalance;
    String accountLocation;

    public accountInfo(String accountName, int accountId, int accountBalance, String accountLocation) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.accountLocation = accountLocation;
    }

    void showStatus() {
        System.out.println("Account: " + accountName);
        System.out.println("Id" + accountId);
    }

    void showAccountStatus() {
        System.out.println("Статус: Basic");
        System.out.println("Можливості: Limited");
    }
}