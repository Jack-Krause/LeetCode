import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblemsTest {
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
        String out = EasyProblems.sortVowels(vString1);
        assertEquals(out, vE1);
        String out2 = EasyProblems.sortVowels(vString2);
        assertEquals(out2, vE2);
    }




}