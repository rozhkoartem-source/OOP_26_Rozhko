public static void main(String[] args) {
    AccountInterface account;

    account = new BasicAccountInfo("Sanya",10123,353, "Odesa", 15, 3, 2025);
    account.showStatus();
    account.showAccountStatus();
    System.out.println();

    account = new PlusAccountInfo("Artem",7,10000, "Kiyv", 23, 4, 2024);
    account.showStatus();
    account.showAccountStatus();
    System.out.println();

    accountInfo accountTest = new accountInfo("Admin", 1, 0, "None", 1, 1, 1860);
    accountTest.showStatus();
    accountTest.showAccountStatus();
}