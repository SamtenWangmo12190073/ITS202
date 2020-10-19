import java.util.*;
public class ArrayList
{
	double one_over_four = 0.25;
	double three_over_four = 0.75;
	int cap = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public ArrayList()
	{
		Array = new int[cap];
	}

	//which takes a generic variable as a parameter and adds the element to the dynamic array. Insert elements into a dynamic array which doubles in size when the array is 3/4th full and halves in size when the array is 1/4th full
	public void add(int e) 
	{
		Array[top] = e;
		top++;
	}
	//this function does not take a parameter.When called pop deletes the last element in the dynamic array.
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		a = count;
		length = (double)a/cap;
		System.out.println("Remove Element " +remove);
	}
	//This function takes one integer parameter. When called resize changes the size of the array to the value of the parameter sent.
	public void resize() 
	{
		if(length == one_over_four ) {
			int newArray[] = new int[(cap/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			cap = cap/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == three_over_four) {
			int newArray[] = new int[cap*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			cap = cap * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("Array Index Out Of Bound");
		}
	}
	//Does not take ay parameter and returns the number of elements present in the dynamic array.
	public int size()
	{
		return cap;
	}

	//Does not take any parameter and returns the string representation of the dynamic array.
	public String toString()
	{
		String s = Arrays.toString(Array);
		return s;
	}

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(8);
		obj.add(5);
		obj.add(6);
		obj.add(2);
		obj.pop();
		obj.resize();
		System.out.println("toString " +obj.toString());
		System.out.println("Elements in the new Array is " +a);
		System.out.println("Size of new Array is " +obj.size());
	}
}