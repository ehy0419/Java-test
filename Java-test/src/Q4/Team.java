package Q4;

import java.util.ArrayList;

class Team {

    ArrayList<Player> playerList;

    // 속성
    String teamName;
    /* TODO: 올바른 타입의 필드(속성) 선언 변수명은 playerList; */

    // 생성자
    public Team(String teamName) {
        this.teamName = teamName;
        /* TODO: 위에서 선언한 playerList 필드 초기화 */

        // 생성자 안에서, ArrayList<Player> playerList; 필드 초기화
        playerList = new ArrayList<>();
    }

    // 기능
    public void addPlayer(Player player    /* TODO: 올바른 매개변수를 선언하세요 */) {
        // TODO: 매개변수로 받은 player 객체를 playerList에 추가하세요.
        playerList.add(player);
    }

    // BaseballManager 클래스에서
    // 팀에 선수 추가 TODO: Team의 addPlayer 메서드 완성후 아래 주석을 해제해주세요.
    //         myTeam.addPlayer(player1);
    //         myTeam.addPlayer(player2);

    public void printPlayerList() {
        // TODO: 반복문을 사용하여 playerList에 있는 모든 선수의 이름을 출력하세요.
        for (Player player : playerList) {
            System.out.println(player.name);
        }
    }
}

/// 제네릭 : 클래스나 메서드가 다룰 데이터 타입을 외부에서 결정할 수 있게 해주는 문법
//ArrayList<String> strList;        // 문자열만 저장하는 리스트
//ArrayList<Integer> intList;       // 정수만 저장하는 리스트
//ArrayList<Player> playerList;     // Player 객체만 저장하는 리스트

//ArrayList<T> 어떤 타입이 들어올지 모르니 <T> 라는 제네릭 타입으로,
//ArrayList<Player> 여기에서는 Player 만 넣을 수 있다고 제한한 것이다. 'Player를 저장하는 상자 타입을 미리 지정한 것'

///  제네릭, 스트림, 람다 에 대해서 공부하자..
