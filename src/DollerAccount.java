public class DollerAccount extends  BankAccount{

    //오버 로딩 => 부모 클래스에서 상속받은 메서드에서 파라미터를 변경
    // 새로운 매소드 정의!
    void inquiry(double currencyRate) {}

    //오버 라이딩 => 부모 클래스에서 상속받은 메서드의 내용변경
    // 자식 클래스의 상황에 맞게
    //파라미터는 부모 그대로 따라감.
    public void deposit(){

    }

    // 오버로딩은 파라미터가 바뀌는 것.
    // 오버 라이딩은 중괄호, 즉 메서드의 코드블락이 변경되는 것.


}
