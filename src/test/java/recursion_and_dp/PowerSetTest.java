package recursion_and_dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PowerSetTest {
  
  @Test
  public void testPowerSetForThreeElementArray() {
    List<Integer> set = new ArrayList<>(Arrays.asList(1, 2, 3));
    String actual = PowerSet.run(set).toString();
    String expected = "[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]";
    assertEquals(expected, actual);
  }

  @Test
  public void testPowerSetForAnEmptyArray() {
    List<Integer> set = new ArrayList<>();
    String actual = PowerSet.run(set).toString();
    String expected = "[[]]";
    assertEquals(expected, actual);
  }
}
