package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

  @Test
  public void testStringsThatAreOneAway() {
    assertTrue(OneAway.run("pale", "ple"));
    assertTrue(OneAway.run("pales", "pale"));
    assertTrue(OneAway.run("pale", "bale"));
    assertTrue(OneAway.run("pale", "pale"));
    assertTrue(OneAway.run("", ""));
  }

  @Test
  public void testStringsThatAreNotOneAway() {
    assertFalse(OneAway.run("pale", "bake"));
    assertFalse(OneAway.run("pale", "pa"));
  }
}