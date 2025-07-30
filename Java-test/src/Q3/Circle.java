package Q3;

class Circle extends Shape /* TODO: 상속 구현 */ {

    // 속성
    private double radius; // 반지름

    // 생성자
    public Circle(double radius) {

        this.radius = radius;
    }

    // 기능
    @Override
    public double getArea() {
        // TODO: 원의 넓이를 계산하여 반환하는 코드를 작성하세요.
        // 원 넓이 공식: 3.14 * 반지름 * 반지름
        return 3.14 * radius * radius;
    }
}