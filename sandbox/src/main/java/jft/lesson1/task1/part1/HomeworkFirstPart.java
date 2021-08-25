package jft.lesson1.task1.part1;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class HomeworkFirstPart {
	public static void main (String[] args){
		Point a = new Point(6, 8);
		Point b = new Point(2, 2);

		System.out.println("Расстояние между точкой А с координатами (" + a.x + ";" + a.y + ") и точкой В с координатами (" +
						b.x + ";" + b.y + ") равно: " + distance(a, b));

	}
	public static double distance (Point p1, Point p2){
		return sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2));
	}
}
