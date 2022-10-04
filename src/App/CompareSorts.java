package App;

import java.util.Calendar;

public class CompareSorts {

	public int[] execute(int[] insertionSortArray, int[] quickSortArray) {
		
        QuickSort quickSort = new QuickSort();  
        InsertionSort insertionSort = new InsertionSort();
        
        Calendar time1;
        Calendar time2;
        long start;
        long end;
        int n;  
        int[] results = new int[2];

	    time1 = Calendar.getInstance() ;
	    start = time1.getTimeInMillis() ;
	    insertionSort.sort(insertionSortArray);
	    time2 = Calendar.getInstance() ;
	    end = time2.getTimeInMillis() ;
	    
	    results[0] = (int) (end - start);

	    n = quickSortArray.length;
	    
	    time1 = Calendar.getInstance() ;
	    start = time1.getTimeInMillis() ;
	    quickSort.quicksort(quickSortArray, 0, n-1);
	    time2 = Calendar.getInstance() ;
	    end = time2.getTimeInMillis() ;

	    results[1] = (int) (end - start);
		return results;
	}

}
