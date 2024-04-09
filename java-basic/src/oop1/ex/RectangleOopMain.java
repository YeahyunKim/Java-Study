package oop1.ex;
//객체지향 풀이방법
public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 8;

        int area = rect.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rect.calculatePerimeter();
        System.out.println("둘레 : " + perimeter);

        boolean isSquare = rect.isSquare();
        System.out.println("정사각형 인가요? : " + isSquare);

    }
}
