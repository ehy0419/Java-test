package Q5;

public class Account {

    // 속성
    String accountNumber;       // 계좌번호
    int balance;                // 잔액


    // 생성자          - 계좌 번호와 잔액을 받아서 객체 생성 BankingSystem 클래스에서.
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 기능
    // deposit : 예금
    public void deposit(int amount) {
        // TODO: 현재 잔액(balance)에 입금액(amount)을 더하세요.
        this.balance += amount;  /// 자동 완성 활용
    }

    // withdraw : 출금
    public void withdraw(int amount) {
        // TODO: 출금액이 잔액보다 작거나 같을 경우에만 잔액에서 출금액을 빼세요.
        if (this.balance >= amount) {  /// 자동 완성 활용
            this.balance -= amount;
        }  else {
            System.out.println("잔액이 부족합니다.");
        }

    }
}

/// 1. 문제 살펴보기
// 문제 간단한 은행 입출금 시스템
//`Account` 클래스의 입출금 메서드와 `Bank` 클래스의 계좌 찾기 메서드를 완성하여 간단한 은행 시스템 로직을 구현하세요.

// 속성, 생성자, 기능을 구분해보자! - 구분하기 어려운 점..