package algorithm;

public class StringExercise {

    String getMiddle(String word) {
        String result;
        int pivot = word.length() / 2;
        if (word.length() % 2 == 0) {
            result = word.substring(pivot - 1, pivot + 1);
        } else {
            result = word.substring(pivot, pivot + 1);
        }
        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
