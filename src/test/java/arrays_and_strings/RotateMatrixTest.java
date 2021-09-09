package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

  @Test
  public void testMatrixRotationWithThreeLinesAndColumns() {
    int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };
    int[][] expected = {
            { 7, 4, 1 },
            { 8, 5, 2 },
            { 9, 6, 3 }
    };
    assertArrayEquals(expected, RotateMatrix.run(matrix, 3));
  }

  @Test
  public void testMatrixRotationWithFourLinesAndColumns() {
    int[][] matrix = {
            { 1, 1, 1, 1 },
            { 2, 2, 2, 2 },
            { 3, 3, 3, 3 },
            { 4, 4, 4, 4 }
    };
    int[][] expected = {
            { 4, 3, 2, 1 },
            { 4, 3, 2, 1 },
            { 4, 3, 2, 1 },
            { 4, 3, 2, 1 }
    };
    assertArrayEquals(expected, RotateMatrix.run(matrix, 4));
  }
}
