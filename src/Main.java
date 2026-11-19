public static void main(String[] args) {
    accountInfo account;

    account = new BasicAccountInfo("Sanya",10123,353);
    account.showStatus();
    System.out.println();

    account = new PlusAccountInfo("Artem",7,10000);
    account.showStatus();
}