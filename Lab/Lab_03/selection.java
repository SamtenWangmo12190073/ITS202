public class selection{

	public static void selectionsort(int array[]) {
		int n = array.length;

		for (int i = 0; i < n-1; i++ ) {
			int lowestelement = i;  
                for (int j = i + 1; j < n; j++){  
                    if (array[j] < array[lowestelement]){  
                        lowestelement = j;//to find the lowest element  
                    } 

                } 

                int temp = array[lowestelement];
                array[lowestelement] = array[i];
                array[i] = temp; //to swap the element with the smallest element after comparing it till the last
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

		selectionsort(arr1);
		for(int i:arr1){
			System.out.print(i +" ");
		}
		System.out.println();
		
	}
}