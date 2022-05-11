public class Task3 {
    static class BankAccount {
        private double balance;

        public BankAccount(){}
        public BankAccount(double balance){
            this.balance = balance;
        }

        public void deposit(double amount){
            if(this.balance + amount <= 5000){
                this.balance = this.balance + amount;
            }
            else System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + (this.balance + amount));
        }
        public void withdraw(double amount){
            if(this.balance - amount >= 0){
                this.balance = this.balance - amount;
            }
            else System.out.println("There is not enough funds.");
        }
        public void printBalance(){
            System.out.println("Your current balance is: " + balance);
        }
        public void transferTo(BankAccount destination,double amount) {
            if(this.balance - amount >= 0){
                destination.deposit(amount);
                this.balance = this.balance - amount;
            }
            else System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
        }
        public void transferFrom(BankAccount source,double amount) {
            if (source.balance - amount >= 0) {
                source.balance = source.balance - amount;
                this.deposit(amount);
            }
            else System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + source.balance + " are available.");
        }
    }
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(2500);

        account1.withdraw(100);
        account1.deposit(3000);
        account2.deposit(3000);
        account1.transferTo(account2,4000);
    }
}
