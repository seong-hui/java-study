import java.util.ArrayList;

public class LIstsExample {
    public static void main(String[] args) {
        //Lists
        // 순서 구분, 중복 허용
        // vector, arraylist, linkedlist

        ArrayList list = new ArrayList(10);
        list.add(100);
        list.add("INTP");

        for ( int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //자료형 제한하기
        ArrayList<Integer> list_i = new ArrayList(10);

    }
}
