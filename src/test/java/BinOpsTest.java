import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinOpsTest {
    @Test
    void calculatorSumTest() {
        BinOps bins = new BinOps();
        String value1 = "100"; // 6
        String value2 = "110"; // 4

        String actual = bins.calculator(value1, value2, Operation.SUM);
        String expected = "1010"; // 10

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculatorMultTest() {
        BinOps bins = new BinOps();
        String value1 = "101"; // 5
        String value2 = "010"; // 2

        String actual = bins.calculator(value1, value2, Operation.MULT);
        String expected = "1010"; // 10

        Assertions.assertEquals(expected, actual);
    }
}
