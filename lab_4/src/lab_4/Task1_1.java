package lab_4;

public class Task1_1 {
	// selectionSort iterative
	/*	public static void selectionSort(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						Swap(j, i, array);
					}
				}
			}
		} */
		// selection recursive
		/*public static void selectionSort(int[] array,int stepNum) {
			
		} */
		// swap i and j
		public static void Swap(int j, int i, int[] arr1) {
			int temp = arr1[j];
			arr1[j] = arr1[i];
			arr1[i] = temp;
		}

		public static void main(String[] args) {
			int[] ar1 = { 4, 8, 7, 9 };
			//selectionSort(ar1); for iterative
			for (int num : ar1) {
				System.out.println(num + " ");
			}
		}

}
