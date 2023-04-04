import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {
        // Map
        // 키 - 값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음
        // 키는 증복 불가, 값은 중복 허용
        //HashMap

        HashMap<String, String> map = new HashMap(); //인자처리 안해도 됨.
        map.put("age", "23");
        map.put("mbti", "INTP");

        System.out.println(map.get("age")); //키 값 넣기

    }
}
