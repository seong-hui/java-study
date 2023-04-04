public class ArraysExample {
    public static void main(String[] args) {
        //배열(Arrays)
        // 배열 변수를 그대로 전달하면 주소를 가르킴.
        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INTP", "ENTP", "INTJ"};

        System.out.println(price[0]);
        System.out.println(mbti[0]);

        price[1] = 8000;
        System.out.println(mbti.length);
        for (int i = 0; i <mbti.length; i++)
        {
            System.out.println(mbti[i]);
        }
    }
}
