public class linearsearch{
	public static int linearsearch(int[] a, int key) {
		for(int i = 0; i<a.length; i++){
			if(a[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] arg) {
		int[] a = {23,45,43,65,33,21};
		int key = 3;
		if (linearsearch(a, key) == -1)
			System.out.println("Key not found!!");
		else{
			
			System.out.println(key+" is found at index:"+linearsearch(a, key));
		}
		
	}
}




