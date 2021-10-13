package recursion_and_dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationsWithoutDupsTest {
  
  @Test
  public void testPermutationsWithoutDups() {
    String s = "abc";
    List<String> expected = new ArrayList<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    List<String> actual = PermutationsWithoutDups.run(s);
    Collections.sort(expected);
    Collections.sort(actual);
    assertEquals(expected, actual);
  }
}
