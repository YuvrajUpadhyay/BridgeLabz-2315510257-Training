public class BankAccount {
    private static int totalaccounts =0;
    private static String bankname ="PNB";
    private String accountholdername;
    private final int accountnumber;

    public BankAccount(String accountholdername,int accountnumber){
        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
        totalaccounts++;
    }

    static void getTotalAccounts(){
        System.out.println("Total Accounts "+totalaccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankname);
            System.out.println("Account Holder: " + accountholdername);
            System.out.println("Account Number: " + accountnumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Yuvraj",1);
        getTotalAccounts();
        a.displayAccountDetails();
    }
}
