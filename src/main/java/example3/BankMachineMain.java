package example3;

public class BankMachineMain {

    public static void main(String[] args) {

        CreditCard masterCard = new CreditCard( 1234, "Karolis");
        BankAccount snoras = new BankAccount("Edvinas", "1");
        snoras.showMenu(masterCard);

    }
}
