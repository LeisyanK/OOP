package org.example.lecture1;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
//        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));  // для переменных со статусом private так получить значения не получится, нужно использовать getter
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
//        a.x = 0;
//        a.y = 2; // перенесли задание значений переменных в конструктор (строка 13)
        System.out.println(a.getX());  //(a.getInfo());

        Point2D b = new Point2D(10);
//        b.x = 0;  // используем конструктор с одним аргументом
//        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));

        double dis = Point2D.distance(a, b); // метод, который был описан здесь выше, перенесли внутрь класса Point2D и здесь мы его вызываем
        System.out.println(dis);
    }
}
