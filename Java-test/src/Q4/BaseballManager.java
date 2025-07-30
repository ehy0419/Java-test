package Q4;

public class BaseballManager {
    public static void main(String[] args) {
        // 팀 생성
        Team myTeam = new Team("드림팀");

        // 선수 생성 (야구 선수로 변경)
        Player player1 = new Player("오타니");
        Player player2 = new Player("김혜성");

        // 팀에 선수 추가 TODO: Team의 addPlayer 메서드 완성후 아래 주석을 해제해주세요.
         myTeam.addPlayer(player1);
         myTeam.addPlayer(player2);

        // 팀 선수 목록 출력
        myTeam.printPlayerList(); // 예상 결과: 오타니, 김혜성 출력
    }
}

/// 1. 문제 살펴보기
//참조 변수와 객체 간의 상호작용
//`Team` 클래스에 `Player` 객체를 추가하고, 소속된 선수 명단을 출력하는 `printPlayerList`와 추가하는 `addPlayer`메서드를 완성하세요.

///  '참조 변수와 객체' 에 대한 이해 확인
// 객체 Object : new 로 만든 것. 메모리에 만들어진 실체
// 참조 변수 refernce variable : 이 객체를 알려주는 참조값

// 예시
// Player player1 = new Player("오타니");
// new Player("오타니")    -> 객체(메모리에 만들어진 실체)
// player1                -> 참조 변수 (생성된 객체를 위한 명찰!)
// "오타니" 라는 이름의 선수를 만들고, 그 선수를 player1 이라는 이름표로 저장할게요."

///  '상호작용' 에 대한 이해 확인
// 참조 변수를 이용해서 객체에 접근하고, 이 객체의 정보나 기능을 사용하는 것.
// 예시
// Player player1 = new Player("오타니");
// player1 이라는 참조변수를 통해서 new Player("오타니") 객체에 접근하고,
// player1.name 에서 .name을 붙이면 "오타니" 라는 이름을 꺼내서 사용하는 것.

/// 문제 분석
// `Team` 클래스에 `Player` 객체를 추가하고, 소속된 선수 명단을 출력하는 `printPlayerList`와 추가하는 `addPlayer`메서드를 완성하세요.
// Team 클래스에 여러 명의 Player 객체를 만들어준다.        -> 필요한 것은 선수 명단을 저장할 수 있는 공간 만들기
// 선수 이름을 출력하는 printPlayerList 메서드
// 선수를 추가해주는 addPlayer 메서드

/// 선수 명단 저장 공간 String? , ArrayList?
// 선수 명단을 저장할 공간은 String? , ArrayList?
// 선수 명단에는 이름, 키, 몸무게, 선호하는 발, 역할 등의 정보가 있으므로 ArrayList.

// 문제에서 '`Team` 클래스에 `Player` 객체를 추가하고' 을 적용하면,
// Team 클래스에 ArrayList<Player> players = new ArrayList<Player>(); 자동완성 됨

///  공부할 것
//  ArrayList<Player> playerList;                          -> 클래스 속성(필드)에 선수 명단을 담을 저장 공간
//  playerList = new ArrayList<>();
//  playerList = new ArrayList<Player>();                  ->
//  ArrayList<Player> playerList = new ArrayList<Player>();

// 생성자에서 playerList = new ArrayList<>();  로 초기화 하는 이유
// ArrayList<Player> playerList;  로 선언하였고, 객체를 담을 playList 상자를 만든 것.
// 초기화 해야 addPlayer 메소드, printPlayerList 메소드 사용 가능하다.


/// 작성 순서
// ArrayList<Player> playerList; 를 사용해서 선수들의 명단을 저장할 공간 만들기
// Team 클래스 에 객체 Player 리스트를 속성으로 선언
// 생성자 안에서 속성에서 선언된 playerList 속성 초기화

// 2가지 메서드 생성
// BaseballManager 클래스 에 있는 객체 Player를 addPlayer 메소드로 리스트에 저장
// BaseballManager 클래스 에 있는 객체 Player를 printPlayerList 메소드로 선수 이름 출력

/// addPlayer 메소드 이해
// public void addPlayer(Player player) {
//        playerList.add(player);
//    }
// Player 객체를 매개변수로 (매개변수) 받아서 선언된 리스트에 추가
// "외부에서 player 를 주면, playerList 상자에 넣는다."

/// printPlayerList 메소드 이해
// public void printPlayerList() {
//        for (Player player : playerList) {
//            System.out.println(player.name);
//        }
// playerList에 있는 선수들의 이름을 출력해주세요.
// "리스트 안에 있는 선수 이름을 출력할게요."

/// BaseballManager 클래스로 확인
// 팀 생성      Team myTeam = new Team("드림팀");
// 선수 생성    Player player1 = new Player("오타니");
// 선수 추가    myTeam.addPlayer(player1);
// 팀 출력      myTeam.printPlayerList();  // 저장된 리스트에 한 명만 있다면, '오타니'



