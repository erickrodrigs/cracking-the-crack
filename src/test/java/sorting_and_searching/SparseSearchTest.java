package sorting_and_searching;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidAlgorithmParameterException;

import org.junit.jupiter.api.Test;

public class SparseSearchTest {
  
  @Test
  public void testSparseSearchForAValidTarget() throws Exception {
    String[] arr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
    assertEquals(SparseSearch.run(arr, "ball"), 4);
  }

  @Test
  public void testSparseSearchForAEmptyTarget() throws Exception {
    String[] arr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
    assertThrows(InvalidAlgorithmParameterException.class, () -> SparseSearch.run(arr, ""));
  }
}
