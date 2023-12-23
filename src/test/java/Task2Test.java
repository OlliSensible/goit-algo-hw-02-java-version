import org.example.PalindromeChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Тут"));
        Assertions.assertTrue(PalindromeChecker.isPalindrome("madam"));
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Дід і дід"));
        Assertions.assertTrue(PalindromeChecker.isPalindrome("123a321"));

        Assertions.assertFalse(PalindromeChecker.isPalindrome("hello"));
        Assertions.assertFalse(PalindromeChecker.isPalindrome("Mikri"));
        Assertions.assertFalse(PalindromeChecker.isPalindrome("123ab321"));
    }
}
