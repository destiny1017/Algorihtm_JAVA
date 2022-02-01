package Algorithm_example;

public class Permutation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		permutation(arr, 0, arr.length-1);
	}
	
	static void permutation(int[] arr, int start, int end) {
		if(start == end) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		} else {
			for (int i = start; i <= end; i++) {
				swap(arr, start, i);
				permutation(arr, start+1, end);
				swap(arr, start, i);
			}
		}
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
