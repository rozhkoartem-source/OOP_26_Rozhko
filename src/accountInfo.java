public class accountInfo {
    String accountName;
    int accountId;
    int accountBalance;

    public accountInfo(String accountName, int accountId, int accountBalance) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }

    void showStatus() {
        System.out.println("Account: " + accountName);
        System.out.println("Id" + accountId);
    }
}