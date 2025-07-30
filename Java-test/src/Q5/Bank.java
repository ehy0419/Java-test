package Q5;

import java.util.List;
import java.util.ArrayList;

public class Bank {

    // 속성
    List<Account> accounts = new ArrayList<>();

    // 메서드 return 이 있는 것을 봐서
    public Account findAccount(String accountNumber) {
        // TODO: 반복문을 사용하여 accounts 리스트에서
        // 매개변수로 받은 accountNumber와 일치하는 Account 객체를 찾아 반환하세요.
        // 만약 일치하는 계좌가 없다면 null을 반환하세요.

        for (Account account : accounts) {   /// 자동 완성 활용
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        // 반복문이 끝나도 못 찾으면 null 로 반환
        return null;
    }
}
