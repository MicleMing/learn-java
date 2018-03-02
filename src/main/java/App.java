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
        int a[] = { 1, 3, 2, 5 };
        arr.printArray(arr.insertElement(a, 8, 1));

        arr.addElement("A");
        arr.addElement("B");
        arr.addElement("C");
        arr.addElement("D");
        arr.reverseList();
    }
}
