package data;

public class Stack {
  private char[] stackArray;
  private int top;
  private int maxSize;

  public Stack(int max) {
    stackArray = new char[max];
    maxSize = max;
    top = -1;
  }

  public void push(char c) {
    stackArray[++top] = c;
  }

  public char pop() {
    return stackArray[--top];
  }

  public char peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == maxSize - 1;
  }
}
