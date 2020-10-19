public class bubble{

	public static void bubblesort(int array[]) {
		int n = array.length;

		for (int i = 0; i < n; i++ ) {
 
                for (int j = 0; j < n-1; j++){  
                    if (array[j] > array[j+1]){  
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    } 

                } 

			}
	}
	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};
		int n = arr1.length;

		System.out.println("unsorted array");

		for(int i=0; i< arr1.length; i++) {
			System.out.print(arr1[i] + " ");

		}	
		System.out.println();

		System.out.println("sorted array");

		bubblesort(arr1);
		for(int i:arr1){
			System.out.print(i +" ");
		}
		
		System.out.println();


	}
}