 class BankAccount {
    int accNo;
    String name;
    double balance;

    // Constructor 1
    BankAccount(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        this.balance = 0;   
    }

    // Constructor 2 
    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(accNo + " " + name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, "Rohit");
        BankAccount b2 = new BankAccount(1002, "Neha", 5000);



        b1.display();
        b2.display();
        
    }
}
 