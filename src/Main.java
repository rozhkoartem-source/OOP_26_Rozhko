public static void main(String[] args) {
    AccountInterface account;

    System.out.println("---------------------- Поліморфізм");
    account = new BasicAccountInfo("Sanya", 10123, 353, "Odesa", 15, 3, 2025, "Basic");
    account.showStatus();
    account.showAccountStatus();
    System.out.println("----------------------");

    account = new PlusAccountInfo("Artem", 7, 10000, "Kiyv", 23, 4, 2024, "Plus");
    account.showStatus();
    account.showAccountStatus();
    System.out.println("---------------------- Фабрика");

    AccountInterface accountFabric1 = AccountInfoFabric.createAccount(
            "Basic", "Borya", 230,
            1200, "Dnepropetovsk", 5, 11, 2025);
    AccountInterface accountFabric2 = AccountInfoFabric.createAccount(
            "Plus", "Andrey", 4905,
            2400, "Lviv", 6, 9, 2026);

    accountFabric1.showStatus();
    accountFabric1.showAccountStatus();
    System.out.println("----------------------");
    accountFabric2.showStatus();
    accountFabric2.showAccountStatus();
    System.out.println("----------------------");
}