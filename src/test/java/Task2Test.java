import org.example.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    public void testIsPalindrome() {
        Assertions.assertTrue(Task2.isPalindrome("Тут"));
        Assertions.assertTrue(Task2.isPalindrome("madam"));
        Assertions.assertTrue(Task2.isPalindrome("Дід і дід"));
        Assertions.assertTrue(Task2.isPalindrome("123a321"));

        Assertions.assertFalse(Task2.isPalindrome("hello"));
        Assertions.assertFalse(Task2.isPalindrome("Mikri"));
        Assertions.assertFalse(Task2.isPalindrome("123ab321"));
    }
}
