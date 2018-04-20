public class ReverseStr {
    public String reverseStr(String str){
        String[] units = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = units.length - 1; i >= 0; i--) {
            sb.append(units[i]);
        }
        return sb.toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}