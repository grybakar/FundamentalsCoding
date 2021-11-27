package example4;

import java.io.FileNotFoundException;
import java.util.List;

public class EmailApplication {

    public static void main(String[] args) throws FileNotFoundException {
        List<Account> accountList = AccountService.getAccountFromDatabase();
        for (Account account : accountList) {
            System.out.println(account);
        }

        Account newEmployeeAccount = new Account("Karolis","Grybas");
        System.out.println(newEmployeeAccount);
    }
}
