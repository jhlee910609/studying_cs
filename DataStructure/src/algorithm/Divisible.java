package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible {

    public int[] divisible(int[] array, int divisor) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                result.add(array[i]);
            }
        }
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}

