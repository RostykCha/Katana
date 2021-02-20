import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task4_AllInclusive {
    private static void testing(Boolean actual, Boolean expected) {
        assertEquals(expected, actual);
    }

    public static boolean containAllRots(String strng, List<String> arr) {
        char[] rots = strng.toCharArray();
        System.out.println("###############################################################");
        System.out.println("Test for " + strng);
        for (char character : rots) {
            boolean condition = false;
            for (String word : arr) {
                if (word.toCharArray()[0] == character) {
                    condition = true;
                    System.out.println(word + "starts with " + character);
                    break;
                }
            }
            if (!condition) {
                System.out.println("NOT FOUND word that starts with " + character);
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests containAllRots");
        testing(containAllRots("", Arrays.asList()), true);
        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(containAllRots("", a), true);
        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(containAllRots("bsjq", a), true);
        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(containAllRots("XjYABhR", a), false);
    }

}
