    class BankAccount {
        double balance;

        public BankAccount(){}
        public BankAccount(double balance){
            this.balance = balance;
        }

        public void deposit(double amount){
            if(this.balance + amount <= 5000 && amount > 0){
                this.balance = this.balance + amount;
            }
            else System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + (this.balance + amount));
        }
        public void withdraw(double amount){
            if(this.balance - amount >= 0 && amount > 0){
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
                if(destination.balance + amount <= 5000) {
                    this.balance = this.balance - amount;
                }
            }
            else System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
        }
        public void transferFrom(BankAccount source,double amount) {
            if (source.balance - amount >= 0 && amount + this.balance <= 5000) {
                source.balance = source.balance - amount;
                this.deposit(amount);
            }
            else System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + source.balance + " are available.");
        }
    }

