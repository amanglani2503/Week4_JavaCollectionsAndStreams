package day5regex.advancedproblems.validatecreditcardnumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateCreditCardNumberTest {

    @Test
    void testIsValid_withValidCreditCardNumbers() {
        assertTrue(validateCreditCardNumber.isValid("4123456789012345")); // Visa
        assertTrue(validateCreditCardNumber.isValid("5123456789012345")); // MasterCard
        assertTrue(validateCreditCardNumber.isValid("5223456789012345"));
    }

    @Test
    void testIsValid_withInvalidCreditCardNumbers() {
        assertFalse(validateCreditCardNumber.isValid("6123456789012345")); // Starts with 6
        assertFalse(validateCreditCardNumber.isValid("3123456789012345")); // Starts with 3
        assertFalse(validateCreditCardNumber.isValid("51234567890123")); // Too short
        assertFalse(validateCreditCardNumber.isValid("51234567890123456")); // Too long
        assertFalse(validateCreditCardNumber.isValid("abcdefg123456789")); // Non-numeric characters
    }

    @Test
    void testIsValid_withEmptyString() {
        assertFalse(validateCreditCardNumber.isValid(""));
    }

    @Test
    void testIsValid_withNonNumericCharacters() {
        assertFalse(validateCreditCardNumber.isValid("51ab345678901234"));
    }
}
