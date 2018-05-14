package arrayGabarito;

public class ArrayMultidimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int duasDim [][] = new int [4][];
		duasDim [0] = new int [5];
		duasDim [0][1] = 1;
		duasDim[1] = new int[5];
		System.out.println(duasDim[0][1]);
		System.out.println(duasDim[1]);
		for (int[] is : duasDim) {
			System.out.println(is);
		}

	}

}
