package algorithm;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int count = 0;
        int result = 0;
        for (int temp : binary) {
            result = (int) (temp * Math.pow(2, count));
            count++;
        }
        return result;
    }
}