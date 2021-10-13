package recursion_and_dp;

import java.util.ArrayList;
import java.util.List;

public class RobotInAGrid {
  private static boolean[][] marked;
  private static List<Point> path;

  private static boolean dfs(int[][] grid, int r, int c, int i, int j) {
    if (i == 0 && j == 0) return true;

    marked[i][j] = true;

    boolean pathA = false, pathB = false;

    if (i - 1 >= 0 && !marked[i - 1][j] && grid[i - 1][j] == 0)
      pathA = dfs(grid, r, c, i - 1, j);

    if (j - 1 >= 0 && !marked[i][j - 1] && grid[i][j - 1] == 0)
      pathB = dfs(grid, r, c, i, j - 1);

    if (pathA || pathB) {
      if (pathA)
        path.add(new Point(i - 1, j));
      else
        path.add(new Point(i, j - 1));

      return true;
    }

    return false;
  }

  public static List<Point> run(int[][] grid, int r, int c) {
    marked = new boolean[r][c];
    path = new ArrayList<>();

    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        marked[i][j] = false;
    
    boolean result = dfs(grid, r, c, r - 1, c - 1);

    path.add(new Point(r - 1, c - 1));

    return result ? path : null; 
  }

  private static class Point {
    private final int x;
    private final int y;

    private Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }
}
