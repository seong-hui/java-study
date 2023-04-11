import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {
        //exception


        ArrayList arrayList = new ArrayList(3);

        try {
            arrayList.get(10);
        }catch (IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        }catch(IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 발생");
        }catch (Exception e){
            System.out.println("Exception 발생");
        }
        finally {
            System.out.println("finally");
        }



    }
}
