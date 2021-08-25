package jft.lesson1.task1.part2;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
  double x;
  double y;

  public Point (double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance (Point p){
    return sqrt(pow((p.x - this.x), 2) + pow((p.y - this.y), 2));
  }
}
