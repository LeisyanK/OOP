package org.example.lecture1;

/**
 * private виден только внутри класса, недоступен для внешних агентов
 * public виден из других файлов
 */
public class Point2D {
    private int x, y;   // по умолчанию public, private закрывает переменные и на чтение, и на запись, т.е. х=... не сможем записать в другом файле
                        // закрываем, чтобы сторонние приложения/мошенники не могли изменить и/или получить значения переменных

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value){
        this(value, value);  // здесь вызывается конструктор с двумя аргументами
    }

    public Point2D(){
        this(10);   // здесь вызывается конструктор с одним ар+гументом
    }
//    public Point2D() {  //конструктор по умолчанию/нулевой конструктор - мы переопределили
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {   // конструктор, который принимает единственный аргумент (и у, и х будут принимать одинаковые значения)
//        x = value;
//        y = value;
//    }

    public int getX(){  // чтобы получать значение переменной х со статусом private
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));  // внутри своего класса Point2D переменные х и у видны для методов
    }
}
