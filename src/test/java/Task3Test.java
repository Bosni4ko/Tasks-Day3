import Task5.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    BankAccount testBankAccount_1;
    BankAccount testBankAccount_2;

    @Before
    public void setUp(){
        testBankAccount_1 = new BankAccount();
        testBankAccount_2 = new BankAccount(1000);
    }
    @Test
    public void deposit() {
        testBankAccount_1.deposit(3000);
        assertEquals(3000,testBankAccount_1.balance,0.0000001);
    }
    @Test
    public void depositOverMax() {
        testBankAccount_1.deposit(5500);
        assertEquals(0,testBankAccount_1.balance,0.0000001);
    }
    @Test
    public  void depositNegative(){
        testBankAccount_2.deposit(-100);
        assertEquals(1000,testBankAccount_2.balance,0.0000001);
    }
    @Test
    public  void withdraw(){
        testBankAccount_2.withdraw(500);
        assertEquals(500,testBankAccount_2.balance,0.0000001);
        testBankAccount_2.withdraw(1500);
        assertEquals(500,testBankAccount_2.balance,0.0000001);
    }

    @Test
    public  void transferTo(){
        testBankAccount_2.transferTo(testBankAccount_1,500);
        assertEquals(500,testBankAccount_1.balance,0.0000001);
        assertEquals(500,testBankAccount_2.balance,0.0000001);
    }
    @Test
    public  void transferToFromEmpty(){
        testBankAccount_1.transferTo(testBankAccount_2,500);
        assertEquals(0,testBankAccount_1.balance,0.0000001);
        assertEquals(1000,testBankAccount_2.balance,0.0000001);
    }

    @Test
    public  void transferToTooMuch(){
        testBankAccount_1.deposit(5000);
        testBankAccount_1.transferTo(testBankAccount_2,4500);
        assertEquals(5000,testBankAccount_1.balance,0.0000001);
        assertEquals(1000,testBankAccount_2.balance,0.0000001);
    }

    @Test
    public void transferFrom(){
        testBankAccount_1.transferFrom(testBankAccount_2,500);
        assertEquals(500,testBankAccount_1.balance,0.0000001);
        assertEquals(500,testBankAccount_2.balance,0.0000001);

        testBankAccount_2.transferFrom(testBankAccount_1,500);
        assertEquals(0,testBankAccount_1.balance,0.0000001);
        assertEquals(1000,testBankAccount_2.balance,0.0000001);

        testBankAccount_1.deposit(4600);
        testBankAccount_1.transferFrom(testBankAccount_2,600);
        assertEquals(4600,testBankAccount_1.balance,0.0000001);
        assertEquals(1000,testBankAccount_2.balance,0.0000001);
    }
}