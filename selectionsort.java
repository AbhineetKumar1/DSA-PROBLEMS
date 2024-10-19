//selection sort 
class Solution
{
    // This function returns the index of the smallest element in the unsorted part of the array
	int select(int arr[], int i)
	{
	    int minIndex = i;
	    // Loop to find the minimum element in the unsorted part of the array
	    for(int j = i + 1; j < arr.length; j++) {
	        if(arr[j] < arr[minIndex]) {
	            minIndex = j;
	        }
	    }
	    return minIndex;
	}
	
	// This function implements selection sort on the given array
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0; i < n - 1; i++) {
	        // Find the index of the minimum element in the unsorted part of the array
	        int minIndex = select(arr, i);
	        
	        // Swap the found minimum element with the first element of the unsorted part
	        int temp = arr[minIndex];
	        arr[minIndex] = arr[i];
	        arr[i] = temp;
	    }
	}
}
