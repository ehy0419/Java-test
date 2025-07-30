package Q3;

class Rectangle extends Shape /* TODO: 상속 구현 */ {

    // 속성
    private double width;  // 가로
    private double height; // 세로

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 기능
    @Override
    public double getArea() {
        // TODO: 사각형의 넓이를 계산하여 반환하는 코드를 작성하세요.
        // 사각형 넓이 공식: 가로 * 세로
        return width * height;
    }
}
