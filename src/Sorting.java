import java.util.Arrays;

public class Sorting {
    
	public static void InsertionSort (double[] array) {
		InsertSort(array, array.length, 0);
	}

	private static void InsertSort(double[] array, int high, int low) {
		for (int i = low + 1; i < high; i++) { // Tranverse over the whole array
			for (int j = i; j > low; j--) { // Traverse backwards in the sub array
				if (array[j] < array[j-1]) { // Swap until the value is at the right position assuming the sub array is sorted
					double holder = array[j];
					array[j] = array[j-1];
					array[j-1] = holder;
				} else break;

			}
		}

	}


	public static void mergeSort(double[] array) {
		double[] holder = new double[array.length];
		mergeSort(array, holder, 0, array.length - 1);
	}

	private static void mergeSort(double[] array, double[] holder, int low, int high) {
		// Base case : low == high (equivalent to the subarray with length == 1)
		if (low < high) {
			// Split the array into 2 sub array
			int mid = (high + low)/2;
			

			//Recursively sort the first half
			mergeSort(array, holder, low, mid);

			// Recursively sort the second half
			mergeSort(array, holder, mid + 1, high);

			//Merge the sub array
			merge(array, holder, high, mid, low);
		}

	}

	
	private static void merge(double[] array, double[] holder, int high, int mid, int low) {
		/* 
		The mid variable is needed to mark the endpoint of sub array
		*/

		// copy to the temporary array for comparison
        for (int index = low; index <= high; index++) {
            holder[index] = array[index]; 
        }

		// merge (copy) back to the original array
		// index_1 == pointer of first array
		// index_2 == pointer of second array
		int index_1 = low, index_2 = mid+1;
		int index = low;
        while (index <= high) {
			/* Adding the last element
			   Restriction: After comparison, there is at least 1 element left in one of the sub arrays.
			   The number of positions yet left to filled == the number of elements left in sub array */

			// if the elemens are in the first half array
			if (index_1 > mid) {
				array[index++] = holder[index_2++];
				continue;
			}              
				
			// if the elements are in the second half array
			if (index_2 > high) {
				array[index++] = holder[index_1++];
				continue;
			}               
				

			//Comparing the element from the "sub array"
			if (array[index_2] < holder[index_1])
				array[index++] = holder[index_2++];
			else
				array[index++] = holder[index_1++];
		}
				
				
		
				
	}
		

}
