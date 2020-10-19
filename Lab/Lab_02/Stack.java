public class Stack{
  int top;
  int a[];
  int size;

  public Stack(int x)
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

  public void push(int n){
    if (size == 0){
      a[0] = n;
      top = 0;
    }
    else{
      a[top+1] = n;
      top = top+1;

    }
    size = size+1;
  }

  public int pop(){
    if (size == 0){
      return 0;
    }
    else{
      top = top-1;
      size = size-1;
      return a[top+1];

    }


  }
}