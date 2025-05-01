class Bank {
    private int AccountNumber;
    private String Name;
    private float Balance;


    public int getAccountNumber() {
        return AccountNumber;
    }
    public String getName() {
        return Name;
    }
    public float getBalance() {
        return Balance;
    }
    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;

    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setBalance(float balance) {
        this.Balance = balance;

    }
    public void deposit(float amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("deposited:"+amount);

        }
        else {
            System.out.println("invalid amount");

        }

    }
    public void Withdraw(float amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("withdrawn:"+amount);
        }
        else {
            System.out.println("inavlid amount");

        
        }

    }
    public static void main(String arg[]) {
        Bank b = new Bank();
        b.setAccountNumber(455884);
        System.out.println("Account Number:" +b.getAccountNumber());
        b.setName("ved");
        System.out.println("Name:"+b.getName());
        b.setBalance(10000);
        System.out.println("balance"+b.getBalance());
        b.deposit(500);
        System.out.println("balance after deposit"+b.getBalance());
        b.Withdraw(200);
        System.out.println("balance after withdraw"+b.getBalance());

    }
}