package string;

public class StringTools {
  public void compare(String str1, String str2) {
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareToIgnoreCase(str2));
  }

  public int findLastIndex(String str, String subStr) {
    int lastIndex = str.lastIndexOf(subStr);
    return lastIndex;
  }
}
