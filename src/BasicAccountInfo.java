class BasicAccountInfo extends accountInfo {
    BasicAccountInfo(String accountName, int accountId, int accountBalance) {
        super(accountName, accountId, accountBalance);
    }

    @Override
    void showStatus() {
        System.out.println("Аккаунт: " + accountName);
        System.out.println("Айді: " + accountId);
        System.out.println("Гаманець: " + accountBalance);
        System.out.println("Статус: Basic");
        System.out.println("Можливості: Limited");
    }
}