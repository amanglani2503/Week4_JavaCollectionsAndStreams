package day5regex.extractionproblems.emailaddresses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

class ExtractEmailsTest {

    // Regex pattern for email extraction
    private static final String REGEX = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
    private static final Pattern pattern = Pattern.compile(REGEX);

    // Helper method to extract emails from a given text
    private List<String> extractEmailsFromText(String text) {
        Matcher matcher = pattern.matcher(text);
        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    @Test
    void testValidEmailsExtraction() {
        String text = "Contact us at support@example.com and info@company.org for assistance.";
        List<String> extractedEmails = extractEmailsFromText(text);

        assertEquals(2, extractedEmails.size(), "Incorrect number of emails extracted");
        assertTrue(extractedEmails.contains("support@example.com"), "support@example.com should be extracted");
        assertTrue(extractedEmails.contains("info@company.org"), "info@company.org should be extracted");
    }

    @Test
    void testNoEmailsInText() {
        String text = "There is no email in this text.";
        List<String> extractedEmails = extractEmailsFromText(text);

        assertTrue(extractedEmails.isEmpty(), "No emails should be extracted");
    }

    @Test
    void testEmailsWithDifferentFormats() {
        String text = "Reach me at first.last@email.co.in, user123@sub.example.net, and test_email@gmail.com!";
        List<String> extractedEmails = extractEmailsFromText(text);

        assertEquals(3, extractedEmails.size(), "Incorrect number of emails extracted");
        assertTrue(extractedEmails.contains("first.last@email.co.in"), "first.last@email.co.in should be extracted");
        assertTrue(extractedEmails.contains("user123@sub.example.net"), "user123@sub.example.net should be extracted");
        assertTrue(extractedEmails.contains("test_email@gmail.com"), "test_email@gmail.com should be extracted");
    }
}
