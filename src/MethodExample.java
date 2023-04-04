import java.sql.SQLOutput;

public class MethodExample {

    //함수(메서드)
    public static void main(String[] args) {
        int mod_result = mod(3, 2);
        System.out.println(mod_result);

        String str = greeting();
        System.out.println(str);

        greeting2();


    }
    //1. 입력 0 & 출력 0
    static int mod (int a, int b)
    {
        int result = a % b;
        return result;
    }

    // 2. 입력 0, 출력 x
    static void printNum(int a){
        System.out.println(a);
    }

    //입력 x, 출력 o

    static String greeting()
    {
        return "Hello";
    }
    //4. 입력 x, 출력 x
    static void greeting2(){
        System.out.println("Hello!");
    }
}
