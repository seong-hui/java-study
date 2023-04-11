public class ClassExample {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.changePassword(12345);
        System.out.println(bankAccount.getPassword());
        //접근제어자가 없으면 임의로 데이터를 덮으면 그대로 수정됨.
    }
}