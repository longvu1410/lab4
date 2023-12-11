package lab_4;

public class Task1_2 {
	// sort by descending order
		public static void bubbleSort(int[] array) {
			for (int k = 0; k < array.length-1; k++) {

			for (int i = 0; i < array.length-1-k; i++) {
				if(array[i] > array[i+1]) {
					Swap(i+1, i, array);
				}
			}
			}
		}

		public static void Swap(int j, int i, int[] arr1) {
			int temp = arr1[j];
			arr1[j] = arr1[i];
			arr1[i] = temp;
		}
		public static void main(String[] args) {
			int[] arr2 = {5,3,1,9};
			bubbleSort(arr2);

			for(int num : arr2) {
				System.out.println(num + " ");
			}
		}

}
