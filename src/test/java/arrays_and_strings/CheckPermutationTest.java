package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

  @Test
  public void testWhenTwoStringsArePermutationOfEachOther() {
    String s1 = "abdowfhfd";
    String s2 = "ffdhdowba";
    assertTrue(CheckPermutation.run(s1, s2));
  }

  @Test
  public void testWhenTwoStringsAreNotPermutationOfEachOther() {
    String s1 = "iurehqwiebnbvmnsboijorwoeir";
    String s2 = "iuhdhufiohdfjhieuweerwerw22";
    assertFalse(CheckPermutation.run(s1, s2));
  }
}