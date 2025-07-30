package Q5;

public class BankingSystem {
    public static void main(String[] args) {


        // 생성자? - new 키워드를 통해서 보면 객체를 만든다는 것을 보면.
        // Bank 클래스의 객체 생성
        Bank bank = new Bank();

        // Account 클래스 객체 생성
        // accounts 리스트(account 자료집)에 계좌 추가
        bank.accounts.add(new Account("111-222", 10000));
        bank.accounts.add(new Account("333-444", 50000));

        Account foundAccount = bank.findAccount("111-222");

        if (foundAccount != null) {
            foundAccount.deposit(5000);
            foundAccount.withdraw(3000);
            System.out.println("계좌 " + foundAccount.accountNumber + "의 최종 잔액: " + foundAccount.balance); // 예상 결과: 12000
        }
    }
}
