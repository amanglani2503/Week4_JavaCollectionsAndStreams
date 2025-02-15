package day5junit.advance.bankingsystem;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {
    private BankingSystem account;

    @BeforeEach
    void setUp() {
        account = new BankingSystem(500);
    }

    @Test
    void testDeposit() {
        account.deposit(200);
        assertEquals(700, account.getBalance(), "Balance should be 700 after deposit");
    }

    @Test
    void testWithdraw() {
        account.withdraw(300);
        assertEquals(200, account.getBalance(), "Balance should be 200 after withdrawal");
    }

    @Test
    void testInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(600));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-30));
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
