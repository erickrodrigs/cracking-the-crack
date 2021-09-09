package arrays_and_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

  @Test
  public void testURLify() {
    char[] string = " Mr John Smith      ".toCharArray();
    int length = string.length;
    String expected = "%20Mr%20John%20Smith";
    String result = String.valueOf(URLify.run(string, length));
    assertEquals(expected, result);
  }
}