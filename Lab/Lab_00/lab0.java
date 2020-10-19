public class lab0{
	static int[] array;
	public static int[] resize(int length) {
		int[] temp = new int[length];

		for (int i=0; i<array.length; i++) {
			temp[i] = array[i];
		}
		temp[length - 1] = 4;
		array = temp;
		return array;
	}
	public static void main(String[] args) {
		array = new int[3];
		array[0] =1;
		array[1] =2;
		array[2] =3;

		int[] newarray = resize(4);

		for (int i=0; i<newarray.length; i++) {
			System.out.println(newarray[i]);
		}
	}
}