import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		Random r = new Random();
		int[] randArray = new int[20];
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = r.nextInt(0, 100);
		}
		quickSort(randArray);
		showArray(randArray);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left < right) {
			int pivot = partition(array, left, right);
			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1, right);
		}
		
	}
	public static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int lIndex = left - 1;
		int rIndex;
		for(rIndex = left; rIndex < right; rIndex++) {
			if(array[rIndex] <= pivot) {
				lIndex++;
				int temp = array[lIndex];
				array[lIndex] = array[rIndex];
				array[rIndex] = temp;
			}
		}
		int temp = array[lIndex + 1];
		array[lIndex + 1] = array[rIndex];
		array[rIndex] = temp;
		
		return lIndex + 1;
	}
	

}
