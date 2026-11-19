class PlusAccountInfo extends accountInfo implements AccountInterface {
    PlusAccountInfo(String accountName, int accountId, int accountBalance, String accountLocation) {
        super(accountName, accountId, accountBalance, accountLocation);
    }

    @Override
    public void showStatus() {
        System.out.println("Аккаунт: " + accountName);
        System.out.println("Айді: " + accountId);
        System.out.println("Гаманець: " + accountBalance);
        System.out.println("Регіон: " + accountLocation);
    }

    @Override
    public void showAccountStatus() {
        System.out.println("Статус: Basic");
        System.out.println("Можливості: Limited");
    }
}