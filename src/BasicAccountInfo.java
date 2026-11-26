class BasicAccountInfo extends accountInfo implements AccountInterface {
    BasicAccountInfo(String accountName, int accountId, int accountBalance, String accountLocation,
                     int dayTime, int monthTime, int yearTime, String accountStatus) {
        super(accountName, accountId, accountBalance, accountLocation, dayTime, monthTime, yearTime, accountStatus);
    }

    @Override
    public void showStatus() {
        System.out.println("Аккаунт: " + accountName);
        System.out.println("Айді: " + accountId);
        System.out.println("Гаманець: " + accountBalance);
        System.out.println("Регіон: " + accountLocation);
        System.out.println("Створено: " + dayTime + "."+ monthTime + "." + yearTime);
    }

    @Override
    public void showAccountStatus() {
        System.out.println("Статус: " + accountStatus);
        System.out.println("Можливості: Limited");
    }
}