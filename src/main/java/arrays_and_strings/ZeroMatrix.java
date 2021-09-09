package arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
  public static int[][] run(final int[][] matrix, final int m, final int n) {
    List<List<Integer>> mapZeros = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          List<Integer> newPair = new ArrayList<>();
          newPair.add(i); newPair.add(j);
          mapZeros.add(newPair);
        }
      }
    }

    for (List<Integer> pair : mapZeros) {
      int line = pair.get(0);
      int column = pair.get(0);

      for (int i = 0; i < m; i++) matrix[i][column] = 0;
      for (int j = 0; j < n; j++) matrix[line][j] = 0;
    }

    return matrix;
  }
}
