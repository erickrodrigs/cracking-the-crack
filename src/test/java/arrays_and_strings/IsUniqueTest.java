package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

  @Test
  public void testWhenStringHasAllUniqueCharacters() {
    assertTrue(IsUnique.run("abcdefghij"));
  }

  @Test
  public void testWhenStringHasNotAllUniqueCharacters() {
    assertFalse(IsUnique.run("axsdhufihaidhfhiuewnfe"));
  }
}