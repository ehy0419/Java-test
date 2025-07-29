package Q2;

public class Book {
    // 필드 (속성)
    String title;
    String author;
    int price;

    // 생성자
//    public Book(/* TODO: 올바른 매개변수를 선언하세요 */) {
//        // TODO: 매개변수로 받은 값들을 사용해 클래스의 필드를 초기화하세요.
//        // 'this' 키워드를 사용해야 합니다.
//    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // this 가 필드(속성)을 가리키는 건지, 매개변수를 가리키는 건지..
    // this 가 가까운 것을 가리키는 것이니까
    // public Book(String title, String author, int price) 을 가리키고
    // = 오른족에 있는 title은 필드?

    // 메서드
    public void printInfo() {
        // TODO: "제목: [title], 저자: [author], 가격: [price]원" 형식으로 출력하세요.
        System.out.println("제목: " + title + ",저자: " + author + ",가격: " + price);
    }

    public static void main(String[] args) {
        // TODO: 여기에 Book 객체를 생성하고 printInfo() 메서드를 호출하는 코드를 작성하세요.
        // 예: Book myBook = new Book("자바의 정석", "남궁성", 30000);
        Book myBook = new Book("자바의 정석", "남궁성", 30000);

        myBook.printInfo();
    }

//    myBook.printInfo();
}


/// 문제 : 클래스와 생성자 설계_책을 표현하는 Book 클래스에서 생성자와 정보 출력 메서드를 완성하세요.
// 클래스와 생성자 설계라고 하니 한 개가 아니라 분리해서 해야하나..
// 책 정보를 나타내는 클래스를 따로 만들어야 하나..

// 1. 먼저 내용을 살펴보니
// Book 클래스가 있고, 속성으로 책 제목, 저자, 가격 3가지 필드로 되어있고.
// 3가지 필드로 되어 있는 것을 가지고 생성자를 만들어야 하고.
// 이 때 필요한 것이 'this.'
// 이 값을 이용해서 printInfo() 메서드(기능)로 제목, 저자, 가격 주어진 형식으로 나오게 해야하고.
// main 시작점에서 Book 객체를 생성하고 메서드를 만들어서 선언부랑 호출? 만들어보는 것.


// 2. Book 객체를 만들기 위해서 printInfo() 메서드를 만든다면. 이게 생성자 였었나..
// sout 으로 출력 문구 작성하고
// System.out.println("제목: " + title, ); 으로 하니까 오류 나옴.

// 3. 호출부 내용은 그대로 해보고 나니 콘솔에는 없다..
// myBook.printInfo();
// main 클래스는 코드 시작점이다! { 사이에 작성하기! }

