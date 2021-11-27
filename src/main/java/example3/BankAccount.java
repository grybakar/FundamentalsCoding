package example3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        } else if (amount < 0) {
            System.out.println("Neigiama suma negalima");
        } else {
            System.out.println("Jokiu operaciju nerasta");
        }
    }

    public void showPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Buvo ivesta " + previousTransaction + " euru.");
        } else if (previousTransaction < 0) {
            System.out.println("Buvo isimta " + previousTransaction + " euru.");
        }
    }

    public void withdraw(int amount) {
        if (balance > amount){
            balance -= amount;
            previousTransaction = -amount;
        } else {
            System.out.println("Operacija nepavyko");
        }

    }

    public void showMenu(CreditCard creditCard) {
        boolean isAuthenticated = authenticate(creditCard);

        if (isAuthenticated) {
            char selection;
            Scanner scanner = new Scanner(System.in);
            printGreetingInfo();

            do {
                printMenuSelection();
                selection = scanner.next().charAt(0);
                System.out.println();

                switch (selection) {
                    case 'A':
                        System.out.println("_________________________________");
                        System.out.println("Saskaitos likutis = " + balance);
                        System.out.println("_________________________________");
                        System.out.println();
                        break;
                    case 'B':
                        System.out.println("Iveskite suma, kuria norite prideti: ");
                        int amountToAdd = scanner.nextInt();
                        deposit(amountToAdd);
                        System.out.println();
                        break;
                    case 'C':
                        System.out.println("Iveskiti suma, kuria norite isimti ");
                        int amountToWitdrawn = scanner.nextInt();
                        withdraw(amountToWitdrawn);
                    System.out.println();
                    break;
                    case 'D':
                        System.out.println("Paskutinis atliktas veiksmas ");
                        showPreviousTransaction();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Neteisingai pasirinkote operacija! Pabandykite dar karta");
                        break;
                    case 'E':
                        System.out.println("Nepamirskite korteles. Viso gero");

                }
            } while (selection != 'E');



        }
    }

    private void printMenuSelection() {
        System.out.println("A. Saskaitos likutis");
        System.out.println("B. Prideti pinigu");
        System.out.println("C. Isimti pinigu");
        System.out.println("D. Paskutinis atliktas veiksmas");
        System.out.println("E. Iseiti/Exit");
        System.out.println("_________________________________");
        System.out.println("Pasirinkite norima operacija:");
        System.out.println("_________________________________");
    }

    private void printGreetingInfo() {
        System.out.println("Sveikiname prisijungus");
        System.out.println("Jusu vartotojo ID yra " + customerId);
        System.out.println("Jusu vartotojo vardas yra " + customerName);
        System.out.println();
    }

    private boolean authenticate(CreditCard creditCard) {
        System.out.println("Iveskite PIN:");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();
        return pinCode == creditCard.getCardPin();

    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
