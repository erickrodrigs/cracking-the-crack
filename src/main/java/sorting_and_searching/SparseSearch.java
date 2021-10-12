package sorting_and_searching;

import java.security.InvalidAlgorithmParameterException;

public class SparseSearch {
  private static int findLocation(String[] arr, String target, int start, int end) {
    if (start > end) return -1;

    int middle = (start + end) / 2;

    if (arr[middle].isEmpty()) {
      // find the closest non-empty string
      int left = middle - 1;
      int right = middle + 1;

      while (left <= right) {
        if (left < start && right > end) return -1;

        if (left >= start && !arr[left].isEmpty()) {
          middle = left;
          break;
        }

        if (right <= end && !arr[right].isEmpty()) {
          middle = right;
          break;
        }

        left -= 1;
        right += 1;
      }
    }

    if (arr[middle].equals(target)) {
      return middle;
    } else if (arr[middle].compareTo(target) < 0) {
      return findLocation(arr, target, middle + 1, end);
    } else {
      return findLocation(arr, target, start, middle - 1);
    }
  }

  public static int run(String[] arr, String target) throws Exception {
    if (target.isEmpty())
      throw new InvalidAlgorithmParameterException("Target string must not be empty!");

    return findLocation(arr, target, 0, arr.length - 1);
  }
}
