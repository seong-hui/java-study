public class BankAccount {

    // 멤버 변수
    // private => 동일 클래스 안에서만 참조와 수정이 가능.
    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant; //휴면계좌
    private int password;

    public BankAccount() {} // 디폴트 생성자

    // 메서드
    public void inquiry() {} // 계좌 조회
    public void deposit() {}
    public void heldInDormant() {}

    void changePassword(int password)
    {
        this.password = password;
    }


    // 생성자 instance
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!
    // new 연산자와 함께 사용
    // this -> 인스턴스 자기 자신을 가리킴.
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
        this.bankCode = bankCode; //왼쪽은 클래스에 정의된 멤버변수
        // 오른쪽은 사용자로부터 입력받은 값을 의미
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.isDormant = isDormant;
        this.password = password;
    }


    // get -> 값을 리턴, set -> 값을 변경
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
