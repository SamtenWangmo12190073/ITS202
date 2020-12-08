public class keyindexcount{
	public void keyindex(char[] a){
		int R = 256;
		int N = a.length;
		char[] aux = new char[N];
		int [] count = new int[R+1]; //have to take int since we are counting based on the ASCII value of the particular character.
		// to compute the frequency
		for(int i = 0; i < N; i++)
		count[a[i] + 1]++;

		// Transform counts to indices.
		for (int r = 0; r < R; r++)
 		count[r+1] += count[r];

 		// Distribute the records.
 		for (int i = 0; i < N; i++)
 		aux[count[a[i]]++] = a[i];

		// Copy back.
 		for (int i = 0; i < N; i++)
 		a[i] = aux[i];

 		for (int i = 0; i< a.length; i++){
		 	System.out.println(" "+ a[i]);
		}
	}
	
public static void main(String[] args) {
	char[] a = {'a', 'g', 'r', 'p', 'm'};
	keyindexcount obj = new keyindexcount();
	obj.keyindex(a);
	}
}




