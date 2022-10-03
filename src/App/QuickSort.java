package App;

public class QuickSort {

	public void swap(int[] arr, int low, int pivot){
	    int tmp = arr[low];
	    arr[low] = arr[pivot];
	    arr[pivot] = tmp;
	}
	
	public int partition(int[] arr, int low, int high){
	    int p = low, j;
	    for(j=low+1; j <= high; j++)
	        if(arr[j] < arr[low])
	            swap(arr, ++p, j);

	    swap(arr, low, p);
	    return p;
	}
	
	public void quicksort(int[] arr, int low, int high){
	    if(low < high){
	        int p = partition(arr, low, high);
	        quicksort(arr, low, p-1);
	        quicksort(arr, p+1, high);
	    }
	}
	
}
