import java.util.*;
class Smallest {
	public static void main(String[] args) {
		int[] numbers = {-1,6,9,8,12,0};
		System.out.println(indexOfSmallestFrom(numbers,0));
		System.out.println(indexOfSmallestFrom(numbers,1));
		System.out.println(indexOfSmallestFrom(numbers,2));

		int[] nums = {8,3,7,9,1,2,4};

		// System.out.println(Arrays.toString(nums));

		// swap(nums,1,0);
		// System.out.println(Arrays.toString(nums));

		// swap(nums,0,3);
		// System.out.println(Arrays.toString(nums));
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int smallest(int[] array){

		int smallestNumber = array[0];

		for(int i=0; i < array.length; i++){
			if (array[i] < smallestNumber){
				smallestNumber = array[i];
			}
		}
		return smallestNumber;
	}

	public static int smallestIndex(int[] array){
		int smallestNumber = array[0];
		int index = 0;

		for(int i = 0; i < array.length  ; i++){
			if (array[i] < smallestNumber){
				smallestNumber = array[i];
				index = i;
			}
		}

		return index;
	}

	public static int indexOfSmallestFrom(int[] table, int startIndex){
		int smallestNumber = table[startIndex];
		int index = 0;

		for(int i = startIndex ; i < table.length; i++){
			if(table[i] < smallestNumber){
				smallestNumber = table[i];
			}
		}

		for(int i = 0; i < table.length; i++){
			if(table[i] == smallestNumber){
				index = i;
			}
		}

		return index;
	}

	public static void swap(int[] array, int index1, int index2){
		// {1,2,3,4} - _,1,3 -> {1,4,3,2}
		int temp = array[index1];

		array[index1] = array[index2];
		array[index2] = temp;
	}

	// int[] nums = {3,2,5,4,8,0};
	public static void sort(int[] array){

		for(int j = 0; j < array.length; j++){
			for(int i= 0; i < array.length -1 ; i++){
			if (array[i] > array[i + 1]){
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
			System.out.println(Arrays.toString(array));
		}
		}
	}
}