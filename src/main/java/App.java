import string.*;

public class App {
    public static void main(String[] args) {
        StringTools str = new StringTools();
        str.compare("hello", "Hello");
        int lastIndex = str.findLastIndex("hello world", "llo");
        System.out.println("last index: " + lastIndex);
    }
}
