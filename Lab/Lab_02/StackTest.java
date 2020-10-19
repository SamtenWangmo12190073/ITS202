public class StackTest{


  public static void main(String[] args) {

    Stack s = new Stack(8);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);

    assert(s.size()==4);

    assert(s.isEmpty()==false);
    //System.out.println(s.pop());
    assert(s.pop()==40);
    assert(s.top()==30);
    

    
    System.out.println("pass");

   
  }
}