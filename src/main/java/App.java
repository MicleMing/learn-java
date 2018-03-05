import string.*;
import array.*;

public class App {
    public static void main(String[] args) {
        StringTools str = new StringTools();
        str.compare("hello", "Hello");
        int lastIndex = str.findLastIndex("hello world", "llo");
        System.out.println("last index: " + lastIndex);
        String s = str.removeChar("hello", 2);
        System.out.println("remove: " + s);
        String upStr = str.firstUpStr("hello");
        System.out.println("up: " + upStr);
        String reverseStr = str.reverse("hello");
        System.out.println("reverse: " + reverseStr);
        str.printSplitStr("a-b-c", "-");

        ArrayTools arr = new ArrayTools();
        int arr1[] = { 1, 3, 2, 5 };
        arr.printArray(arr.insertElement(arr1, 8, 1));

        arr.addElement("A");
        arr.addElement("B");
        arr.addElement("C");
        arr.addElement("D");
        arr.reverseList();

        Integer arr2[] = { 4, 5 };
        Integer arr3[] = { 6, 7 };
        // System.out.println(arr.concat(arr2, arr3));

        String arr4[] = { "a", "b" };
        String arr5[] = { "b", "c" };
        // System.out.println(arr.union(arr4, arr5));
        String[] strArr = { "x", "y", "w" };
        arr.printArray(strArr);
    }
}
