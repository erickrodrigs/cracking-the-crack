package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

  @Test
  public void testWithRotationString() {
    assertTrue(StringRotation.run("erbottlewat", "waterbottle"));
  }

  @Test
  public void testWithoutRotationString() {
    assertFalse(StringRotation.run("erbottlewat", "waterasdfdadsbottle"));
  }
}