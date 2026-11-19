public static void main(String[] args) {
    AccountInterface account;

    account = new BasicAccountInfo("Sanya",10123,353, "Odesa");
    account.showStatus();
    account.showAccountStatus();
    System.out.println();

    account = new PlusAccountInfo("Artem",7,10000, "Kiyv");
    account.showStatus();
    account.showAccountStatus();
}