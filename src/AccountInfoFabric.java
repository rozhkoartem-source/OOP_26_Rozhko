public class AccountInfoFabric {
    public static AccountInterface createAccount(
            String accountStatus, String accountName, int accountId, int accountBalance, String accountLocation,
            int dayTime, int monthTime, int yearTime) {

        if (accountStatus.equalsIgnoreCase("Basic")) {
            return new BasicAccountInfo(accountName, accountId, accountBalance, accountLocation,
                    dayTime, monthTime, yearTime, accountStatus);
        } else if (accountStatus.equalsIgnoreCase("Plus")) {
            return new PlusAccountInfo(accountName, accountId, accountBalance, accountLocation,
                    dayTime, monthTime, yearTime, accountStatus);
        } else {
            throw  new IllegalArgumentException(
                    "Немає такого статусу: " + accountStatus
            );
        }
    }
}