abstract class Account {
    String name;
    Account(String name) {
        this.name = name;
    }
    abstract void accountName();
    void showName() {
        System.out.println("Ім'я облікового запису "+name);
    }
}

class NormalAccount extends Account {
    NormalAccount(String name) {
        super(name);
    }
    @Override
    void accountName() {

    }
}