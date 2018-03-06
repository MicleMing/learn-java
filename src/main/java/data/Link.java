package data;

import java.util.LinkedList;

public class Link {
  private LinkedList<String> list = new LinkedList<String>();

  public void add(String str) {
    list.add(str);
  }

  public void addFirst(String str) {
    list.addFirst(str);
  }

  public void addLast(String str) {
    list.addLast(str);
  }

  public String top() {
    return list.getFirst();
  }

  public String pop() {
    return list.removeFirst();
  }

  public void remove(int from, int to) {
    list.subList(from, to).clear();
  }

  public void remove(int from) {
    int to = getLength();
    list.subList(from, to).clear();
  }

  public int getLength() {
    return list.size();
  }

  public void printLink() {
    for(String str : list) {
      System.out.println(str);
    }
  }
}
