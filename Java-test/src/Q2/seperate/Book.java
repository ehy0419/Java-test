package Q2.seperate;

public class Book {

    ///  속생기

    // 필드 (속성)
    String title;
    String author;
    int price;
    // 부가 설명
    // 클래스 안에 선언된 필드, 속성
    // 클래스가 가지고 있는 변수?
    // 엄연히 '내부'에 속한 것


    // 생성자
    // 외부에서 값을 받아 저장하는 생성자
    // 외부는?? 필드(속성) 인가?  _ 필드(속성)은 내부인걸로 확인
    // 매개변수 란 생성자 () 괄호 안에 있는 변수.
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;             // 받은 값을 클래스 안의 필드에 저장.
    }

    // 메서드 (기능)
    public void printInfo() {
        System.out.println("제목: " + title + ",저자: " + author + ",가격: " + price);
    }
}
