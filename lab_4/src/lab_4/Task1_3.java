package lab_4;

public class Task1_3 {
	public static void insertionSort(int[] array) {
	    int n = array.length;
	    for (int i = 1; i < n; i++) {
	        int currentElement = array[i];
	        int j = i - 1;

	        while (j >= 0 && array[j] < currentElement) {
	            array[j + 1] = array[j];
	            j--;
	        }

	        array[j + 1] = currentElement;
	    }
	}

	public static void main(String[] args) {
		int[] arr = {5, 6, 9, 3, 1, 2};
	    insertionSort(arr);

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}

}
