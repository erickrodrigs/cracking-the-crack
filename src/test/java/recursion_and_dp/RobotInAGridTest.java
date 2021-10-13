package recursion_and_dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RobotInAGridTest {
  
  @Test
  public void testWhenGridHasAPath() {
    int[][] grid = {
      { 0, 0, 0, 0, 0 },
      { 0, 1, 0, 0, 0 },
      { 0, 1, 1, 0, 1 },
      { 0, 0, 1, 0, 1 },
      { 0, 0, 1, 0, 0 }
    };

    assertEquals(
      RobotInAGrid.run(grid, 5, 5).toString(),
      "[(0, 0), (0, 1), (0, 2), (0, 3), (1, 3), (2, 3), (3, 3), (4, 3), (4, 4)]"
    );
  }

  @Test
  public void testWhenGridHasNoPath() {
    int[][] grid = {
      { 0, 0, 0, 0, 0 },
      { 0, 1, 0, 0, 0 },
      { 0, 1, 1, 0, 1 },
      { 0, 0, 1, 1, 0 },
      { 0, 0, 1, 1, 0 }
    };

    assertEquals(RobotInAGrid.run(grid, 5, 5), null);
  }
}
