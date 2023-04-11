
//상속
//하나의 클래스만 상속 받을 수 있음 -> 단일 상속

//인터페이스 구현 -> implements로 가져오기
public class SavingAccount extends BankAccount implements Withdrawable{
    boolean isOverdraft;
    void transfer() {};

    // 재정의를 할 떄는 public 붙여주어야 함.
    public void withdraw(){
        System.out.println("Withdraw");
    };

}
