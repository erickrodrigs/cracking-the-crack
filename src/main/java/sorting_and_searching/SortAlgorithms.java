package sorting_and_searching;

public class SortAlgorithms {
  public static class MergeSort {
    private static void merge(int[] arr, int start, int middle, int end) {
      int[] auxiliar = new int[end - start];
  
      for (int i = start; i < middle; i++)
        auxiliar[i - start] = arr[i];
  
      for (int i = middle, j = 0; i < end; i++, j++)
        auxiliar[middle - start + j] = arr[end - j - 1];
  
      int i = 0;
      int j = end - start - 1;
      
      for (int k = start; k < end; k++) {
        if (auxiliar[i] <= auxiliar[j]) {
          arr[k] = auxiliar[i];
          i += 1;
        } else {
          arr[k] = auxiliar[j];
          j -= 1;
        }
      }
    }

    public static void run(int[] arr, int start, int end) {
      if (start >= end - 1) return;
  
      int middle = (start + end) / 2;
      run(arr, start, middle);
      run(arr, middle, end);
      merge(arr, start, middle, end);
    }
  }

  public static class QuickSort {
    private static int partition(int[] arr, int start, int end) {
      int i = start - 1;
      int target = arr[end - 1];
  
      for (int j = start; j < end; j++) {
        if (arr[j] <= target) {
          i += 1;
  
          int aux = arr[j];
          arr[j] = arr[i];
          arr[i] = aux;
        }
      }
  
      return i;
    }
  
    public static void run(int[] arr, int start, int end) {
      if (start >= end - 1) return;
  
      int part = partition(arr, start, end);
      run(arr, start, part);
      run(arr, part, end);
    }
  }
}
