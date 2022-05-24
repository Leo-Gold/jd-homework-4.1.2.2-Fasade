public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String value1 = "1100100"; //100
        String value2 = "100111"; // 39

        String resultSum = bins.calculator(value1, value2, Operation.SUM); //139 - 10001011
        String resultMult = bins.calculator(value1, value2, Operation.MULT); //3900 - 111100111100

        System.out.printf("%s\n%s", resultSum, resultMult);
    }
}