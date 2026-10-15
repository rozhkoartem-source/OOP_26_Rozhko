

abstract class Account { //Батьківський клас
    String name;
    Account(String name) {
        this.name = name;
    }
    abstract void accountName();
    void showName() {
        System.out.println("Ім'я облікового запису "+name);
    }
}

class NormalAccount extends Account { //Дочірній клас
    NormalAccount(String name) {
        super(name);
    }
    void accountName() {
        System.out.println(name + " створено");
    }
}

class PremiumAccount extends Account {
    PremiumAccount(String name) {
        super(name);
    }
    @Override
    void accountName() {
        System.out.println(name + " створено як Premium");
    }
}
