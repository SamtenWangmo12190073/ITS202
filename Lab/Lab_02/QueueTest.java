public class QueueTest{
public static void main(String[] args) {		
        Queue s = new Queue(8);
        s.enqueue(109);
        s.enqueue(20);
        s.enqueue(300);
        s.enqueue(112);
    
        
        assert(s.len()==4);

        assert(s.isEmpty()==false);
        assert(s.first()==109);
        assert(s.dequeue()==109);

        assert(s.len()==3);


        // System.out.println(s.isEmpty());
        // System.out.println(s.len());
        // System.out.println(s.first());
        // System.out.println(s.dequeue());
        // System.out.println(s.len());        

		
        System.out.println("All test cases passed");	
	}

}