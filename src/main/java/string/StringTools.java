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

  public String removeChar(String str, int pos) {
    return str.substring(0, pos) + str.substring(pos + 1);
  }

  public String firstUpStr(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

  public String reverse(String str) {
    StringBuffer sBuffer = new StringBuffer(str);
    return sBuffer.reverse().toString();
  }

  public void printSplitStr(String str, String delimeter) {
    String[] temp = str.split(delimeter);
    for (String s : temp) {
      System.out.println(s);
    }
  }
}
