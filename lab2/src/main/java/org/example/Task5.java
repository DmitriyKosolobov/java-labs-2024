package org.example;

public class Task5 {

    /**
     * объект <code>класс Point</code> представляет точку в двумерном пространстве с координатами (x, y).
     */
    public static class Point{
        private final double x;

        private final double y;

        /**
         * Конструктор без аргументов с координатами (0, 0) по умолчанию.
         */
        public Point(){
            x = 0;
            y = 0;
        }
        /**
         * Конструктор с двумя параметрами (значениями координат точки).
         *
         * @param x X-координата точки.
         * @param y Y-координата точки.
         */
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        /**
         * Возвращает значение x-координаты точки.
         *
         * @return Значение x-координаты.
         */
        public double getX(){
            return x;
        }
        /**
         * Возвращает значение y-координаты точки.
         *
         * @return Значение y-координаты.
         */
        public double getY() {
            return y;
        }
        /**
         * Сдвигает точку на указанные значения по осям x и y.
         *
         * @param dX Смещение по оси x.
         * @param dY Смещение по оси y.
         * @return Новый объект Point, представляющий сдвинутую точку.
         */
        public Point translate(double dX, double dY){
            return new Point(x+dX,y+dY);
        }
        /**
         * Масштабирует точку на указанный коэффициент.
         *
         * @param k Коэффициент масштабирования.
         * @return Новый объект Point, представляющий масштабированную точку.
         */
        public Point scale(double k){
            return new Point(x*k,y*k);
        }
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }

}
