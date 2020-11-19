public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("apple",3);
		obj.put("banana",6);
		obj.put("coconut",12);
		obj.put("coconut",9);
		obj.delete("banana");
		System.out.println(obj.keys());

		 
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
		
		assert(obj.isEmpty() == false);
		assert(obj.size() == 2);
		assert(obj.contains("apple") == true);
		assert(obj.get("apple") == 3);
		System.out.println("All Test Cases Passed");



	}
}
