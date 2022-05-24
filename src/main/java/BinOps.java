public class BinOps {
    public String sum(String a, String b) {
        int valueOne = Integer.parseInt(a, 2);
        int valueTwo = Integer.parseInt(b, 2);
        int result = valueOne + valueTwo;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int valueOne = Integer.parseInt(a, 2);
        int valueTwo = Integer.parseInt(b, 2);
        int result = valueOne * valueTwo;
        return Integer.toBinaryString(result);
    }

    public String calculator(String valueOneString, String valueTwoString, Operation sing) {
        String result = null;
        switch (sing) {
            case SUM:
                result = sum(valueOneString, valueTwoString);
                break;
            case MULT:
                result = mult(valueOneString, valueTwoString);
                break;
        }
        return result;
    }
}