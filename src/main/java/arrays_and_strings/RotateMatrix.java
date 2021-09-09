package arrays_and_strings;

public class RotateMatrix {
  public static int[][] run(final int[][] matrix, final int n) {
    int line = n - 1;
    int column = n - 1;

    while (line > 0) {
      int i = 0;
      int j = 0;

      while (i < line) {
        int aux = matrix[line][j];
        matrix[line][j] = matrix[i][column];
        matrix[i][column] = aux;

        i += 1;
        j += 1;
      }

      line -= 1;
      column -= 1;
    }

    for (int j = 0; j < n / 2; j++) {
      for (int i = 0; i < n; i++) {
        int aux = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = aux;
      }
    }

    return matrix;
  }
}
