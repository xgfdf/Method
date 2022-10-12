package gao.Encape;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Jack");
        account.setBalance(30);
        account.setPassword("000000");

        account.showInfo();
    }
}
