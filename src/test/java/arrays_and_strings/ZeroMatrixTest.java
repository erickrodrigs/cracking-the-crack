package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {

  @Test
  public void testWhenMatrixHasSomeZeros() {
    final int[][] matrix = {
            { 1, 0, 1 },
            { 0, 2, 3 },
            { 4, 5, 6 }
    };
    final int[][] expected = {
            { 0, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 6 }
    };
    assertArrayEquals(expected, ZeroMatrix.run(matrix, 3, 3));
  }
}