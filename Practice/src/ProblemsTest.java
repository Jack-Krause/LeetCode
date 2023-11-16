import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {
    String vString1;
    String vString2;
    String vE1;
    String vE2;

    @Before
    void setup() {
        vString1 = "lEetcOde";
        vString2 = "lYmpH";
        vE1 = "lEOtcede";
        vE2 = "lYmpH";

    }

    @org.junit.jupiter.api.Test
    void sortVowels() {
        setup();
        String out = Problems.sortVowels(vString1);
        assertEquals(vE1, out);
        String out2 = Problems.sortVowels(vString2);
        assertEquals(vE2, out2);
    }




}