package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

  @Test
  public void testWithPalindromePermutationString() {
    assertTrue(PalindromePermutation.run("Tact Coa"));
  }

  @Test
  public void testWithNotPalindromePermutationString() {
    assertFalse(PalindromePermutation.run("aasdhfiahiuiwiwuiweuhjjjjnn"));
  }

}