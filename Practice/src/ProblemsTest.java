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
        String out2 = Problems.sortVowels(vString2);

        assertAll("Given tests",
                () -> assertEquals(vE1, out),
                () -> assertEquals(vE2, out2)
        );
    }

    @Test
    void sortVowelsTestB() {
        String vString1 = "";
        String vString2 = "ttttttt";
        String vString3 = "cccccccccua";
        String vString4 = "UUUOOOIIIEEEAAA";

        String vE1 = "";
        String vE2 = "ttttttt";
        String vE3 = "cccccccccau";
        String vE4 = "AAAEEEIIIOOOUUU";

        String out1 = Problems.sortVowels(vString1);
        String out2 = Problems.sortVowels(vString2);
        String out3 = Problems.sortVowels(vString3);
        String out4 = Problems.sortVowels(vString4);

        assertAll("Edge cases",
                () -> assertEquals(vE1, out1),
                () -> assertEquals(vE2, out2),
                () -> assertEquals(vE3, out3),
                () -> assertEquals(vE4, out4)
                );
    }




}