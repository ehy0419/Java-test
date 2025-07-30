package Q3;

public class Main {
    public static void main(String[] args) {
        // TODO: 하위(자식) 클래스인 Circle과 Rectangle의 인스턴스를 상위(부모) 클래스인 Shape 타입의 참조 변수로 참조할 수 있도록 수정해주세요.
//        Circle circle = new Circle(10);       // 반지름 10           new Circle 객체(실체instance)는 circle 변수 이름으로 Circle 타입(설계도 class)으로 참조
//        Rectangle rectangle = new Rectangle(5, 8); // 가로 5, 세로 8

        // Shape 타입의 참조 변수로 하위 클래스 객체를 참조 (다형성 활용)
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5, 8);

        System.out.println("원의 넓이: " + circle.getArea()); // 예상 결과: 314.0
        System.out.println("사각형의 넓이: " + rectangle.getArea()); // 예상 결과: 40.0
    }
}

/// 1. 문제 살펴보기
//상속과 메서드 오버라이딩
//Shape 추상 클래스를 상속받는 Circle과 Rectangle 클래스에서 getArea() 메서드를 재정의하여 각 도형의 넓이를 구하세요.
// 상속 - extends , implements

/// 클래스 구성
// shape 추상 클래스, 이를 상속하는 Circle, Rectangle
// getArea() 메서드 오버라이딩(재정의) 하여 도형의 넓이 구하기

// Circle 은 Shape 추상 클래스를 상속받고, 반지름을 가지고 원의 넓이를 구하기
// Rectangle 은 Shape 추상 클래스를 상속받고, 가로와 세로를 이용해 사각형의 넓이를 구하기.
// gerAre() 메서더를 통해서 원, 사각형의 넓이를 구하는 방식을 각각 만들기.

///  공부 필요한 것 : extends , implements

// 시도해볼 것
// Circle 클래스에 Circle extends Shape 로 상속
// Rectangle 클래스에 Rectangle extends Shape 로 상속

// @Override 주석 해제로 getArea() 메서드 구현



