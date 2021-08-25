package jft.lesson1.task1.part2;

public class SecondHomework {
  public static void main (String[] args){
    Point a = new Point(6, 8);
    Point b = new Point(2, 2);

    System.out.println("Расстояние между точкой А с координатами (" + a.x + ";" + a.y + ") и точкой В с координатами (" +
            b.x + ";" + b.y + ") равно: " + a.distance(b));

  }
}
