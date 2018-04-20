package algorithm;

import java.util.ArrayList;

public class HarshadNumber {

    public boolean isHarshad(int num) {
        String[] units = (num + "").split("");
        int total = 0;
        for (int i = 0; i < units.length; i++) {
            total = total + Integer.parseInt(units[i]);;
        }
        return ((num % total) == 0) ? true : false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }


}
