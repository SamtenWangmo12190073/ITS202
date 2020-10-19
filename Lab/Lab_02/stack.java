public class Stack{
  int top;
  int a[];
  int size;

  public stack(int x)
  {

    top = -1;
    a = new int[x];
    size = 0;
  }

  public int size(){

    return size;
  }

  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }

  public int top() {
    if (top == -1){
      return 0;
    }
    else 
    {
      return a[top];
    }
  }

  public void push(int x){
    if (size == 0){
      a[0] = x;
      top = a[0];
    }
    else{
      a[++top] = x;

    }
  }

  public int pop(){
    if (size == 0){
      return 0;

    }
    else{
      a[--top] = x;
      return x;
    }
  }




  public static void main(String[] args) {

    Stack s = new Stack(5);
    s.push(10);
    s.push(20);
    s.push(30);

    System.out.println(s.pop() + "popped from stack");
  }
}