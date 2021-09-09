package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

  @Test
  public void testStringCompression() {
    assertEquals("a2b1c5a3", StringCompression.run("aabcccccaaa"));
  }

  @Test
  public void testStringCompressionWithLargestString() {
    assertEquals("abcdefgh", StringCompression.run("abcdefgh"));
  }
}