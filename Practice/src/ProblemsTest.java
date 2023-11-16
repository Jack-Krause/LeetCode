import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @Test
    void sortVowelsTestA() {
        String vString1 = "lEetcOde";
        String vString2 = "lYmpH";
        String vE1 = "lEOtcede";
        String vE2 = "lYmpH";

        String out = Problems.sortVowels(vString1);
        assertEquals(vE1, out);
        String out2 = Problems.sortVowels(vString2);
        assertEquals(vE2, out2);
    }




}