package day4exceptionhandling.illegalargumentexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculateInterestTest {

    @Test
    void testCalculateInterest_ValidInputs() throws CustomIllegalArgumentException {
        double principalAmount = 10000;
        double time = 2;
        double rate = 2.5;
        double expectedInterest = (principalAmount * rate * time) / 100;

        assertEquals(expectedInterest, CalculateInterest.calculateInterest(principalAmount, time, rate), 0.0001);
    }

    @Test
    void testCalculateInterest_NegativePrincipalAmount() {
        double principalAmount = -5000;
        double time = 2;
        double rate = 2.5;

        Exception exception = assertThrows(CustomIllegalArgumentException.class, () ->
                CalculateInterest.calculateInterest(principalAmount, time, rate));

        assertEquals("Invalid Input : Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterest_NegativeRate() {
        double principalAmount = 10000;
        double time = 2;
        double rate = -2.5;

        Exception exception = assertThrows(CustomIllegalArgumentException.class, () ->
                CalculateInterest.calculateInterest(principalAmount, time, rate));

        assertEquals("Invalid Input : Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterest_ZeroValues() throws CustomIllegalArgumentException {
        double principalAmount = 0;
        double time = 2;
        double rate = 2.5;
        double expectedInterest = 0;

        assertEquals(expectedInterest, CalculateInterest.calculateInterest(principalAmount, time, rate));
    }
}