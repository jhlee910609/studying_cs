package algorithm;

public class Collatz {

    public int collatz(int num) {
        int answer = 0;
        int temp = num;

        while (true) {
            if (answer == 500) return -1;

            if (temp % 2 == 0)
                temp = temp / 2;
            else
                temp = (temp * 3) + 1;

            answer++;
            if (temp == 1) return answer;
        }

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 939497;
        System.out.println(c.collatz(ex));
    }
}
