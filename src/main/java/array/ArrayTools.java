package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTools {

  private ArrayList<String> aList = new ArrayList<String>();

  public void printArray(int arr[]){
    System.out.print("[length: " + arr.length + "] ");
    for (int i = 0; i < arr.length; i += 1) {
      if (i != 0) {
        System.out.print(", ");
      }
      System.out.print(arr[i]);
    }
  }

  public int[] insertElement(int original[], int element, int index) {
    int len = original.length;
    int destArray[] = new int[len + 1];
    for  (int i = 0; i < len + 1; i += 1) {
      if (i < index) {
        destArray[i] = original[i];
      }
      else if (i == index) {
        destArray[i] = element;
      }
      else {
        destArray[i] = original[i - 1];
      }
    }
    return destArray;
  }

  public void addElement(String str) {
    aList.add(str);
  }

  public void reverseList() {
    Collections.reverse(aList);
    System.out.println(aList);
  }

  public <T> T[] concat(T[] arr1, T[] arr2) {
    T[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    return result;
  }
}
