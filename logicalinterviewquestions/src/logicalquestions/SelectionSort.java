package logicalquestions;


public class SelectionSort {
	public static void main(String[] args) {
		
		int[] arr={44,53,54,52,52,45,55,76,87,876,59,87,67,86,665};
		// TODO Auto-generated method stub
		selectionSort(arr);
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

	public static void selectionSort(int[] arr) {
		int i, j, minIndex, tmp;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;
			if (minIndex != i) {
				tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
}
