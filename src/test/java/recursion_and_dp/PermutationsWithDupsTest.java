package recursion_and_dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationsWithDupsTest {
  
  @Test
  public void testPermutationsWithDups() {
    String s = "aaaab";
    List<String> expected = new ArrayList<>(Arrays.asList("aaaab", "aaaba", "aabaa", "abaaa", "baaaa"));
    List<String> actual = PermutationsWithDups.run(s);
    Collections.sort(expected);
    Collections.sort(actual);
    assertEquals(expected, actual);
  }
}
