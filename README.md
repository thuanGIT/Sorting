## SELECTION SORT & MERGE SORT COMPARISON

# Sample runs

|                        | N = 1000 | N = 10000 | N = 100000 | N = 1000000 |
|:----------------------:|:--------:|:---------:|:----------:|:-----------:|
| Insertion sort  O(n^2) |    4ms   |    71ms   |   5290ms   |     N/A     |
|  Merge sort O(n*logn)  |    1ms   |    3ms    |    21ms    |    178ms    |

# Description

The table shows a sharp difference in the growth of runtime as n increases. The time lapse for insertion sorts to finish its job surges at a much faster rate than that of merge sort. Evidently, as n reaches 100000, the time it takes for insertion sort reaches 5290ms in comparison to its initial times of 4ms. Up to 1 million inputs, the program takes so much time that it cannot be determined while merge sorts is just 178ms, indicating a relatively lower growth rate. Hence, it is optimal to use merge sort for sorting a larger number of inputs.


# Test Guide

Copy the following code to test in main method: 

*   Create an large-sized array with random double values
```java
    int n = 1000000;
    double[] array = new double[n];
    
    for (int i = 0; i < array.length; i++)
        array[i] = Math.random()*20;
    
    double[] array_1 = new double[n];
    System.arraycopy(array, 0, array_1, 0, n);
```

*   Estimate the runtime of Insertion Sort

```java
		// Test the insertion sorting method
		System.out.println(Arrays.toString(array) +"\n");
		long start = System.currentTimeMillis();
		InsertionSort(array);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(array));
		System.out.println("\nProcessing time: " + (end - start) + " ms \n"); 
		
```
*    Estimate the runtime of Merge Sort
```java
		// Test the merge sorting method
		System.out.println(Arrays.toString(array_1));
		long start_1 = System.currentTimeMillis();
		mergeSort(array_1);
		long end_1 = System.currentTimeMillis();
		System.out.println(Arrays.toString(array_1));
        System.out.println("\nProcessing time: " + (end_1 - start_1) + " ms\n");
        
```

