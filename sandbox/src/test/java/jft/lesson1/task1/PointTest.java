package jft.lesson1.task1;

import jft.lesson1.task1.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void identicalPointTest (){
    Point p1 = new Point(5, 5);
    Point p2 = new Point(5, 5);

    Assert.assertEquals(p1.distance(p2), 0);
  }

  @Test
  public void negativeCoordinatesTest (){
    Point p1 = new Point(2, 1);
    Point p2 = new Point(-2, -2);

    Assert.assertEquals(p1.distance(p2), 5);
  }
}
