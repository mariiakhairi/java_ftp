package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance() {
    Point p = new Point (2,4,9,16);
    Assert.assertEquals(p.distance(), 13.892443989449804);
  }
}
