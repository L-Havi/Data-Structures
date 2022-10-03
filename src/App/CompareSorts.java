package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;

public class CompareSorts {

	public void execute(int[] insertionSortArray, int[] quickSortArray, File textFile) throws IOException {
		
        QuickSort quickSort = new QuickSort();  
        InsertionSort insertionSort = new InsertionSort();
        
        Calendar time1;
        Calendar time2;
        long start;
        long end;
        int n;  
		
        if(textFile != null) {
        	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
    		FileOutputStream fos = new FileOutputStream(textFile);
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    		bw.write("Sorting " + insertionSortArray.length + " integer array with insertion sort & quick sort");
    		bw.newLine();
    		bw.write("Insertion Sort: ");
    		bw.close();
        }
        
	    System.out.println("\nSorting " + insertionSortArray.length + " integer array with insertion sort & quick sort"); 
	    System.out.print("Insertion Sort: ");

	    time1 = Calendar.getInstance() ;
	    start = time1.getTimeInMillis() ;
	    insertionSort.sort(insertionSortArray);
	    time2 = Calendar.getInstance() ;
	    end = time2.getTimeInMillis() ;

        if(textFile != null) {
        	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
    		FileOutputStream fos = new FileOutputStream(textFile);
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    		bw.write((end - start) + " ms\n");
    		bw.newLine();
    		bw.newLine();
    		bw.write("Quick Sort: ");
    		bw.close();
        }
	    
	    System.out.print((end - start) + " ms\n");
	    System.out.print("Quick Sort: ");

	    n = quickSortArray.length;
	    
	    time1 = Calendar.getInstance() ;
	    start = time1.getTimeInMillis() ;
	    quickSort.quicksort(quickSortArray, 0, n-1);
	    time2 = Calendar.getInstance() ;
	    end = time2.getTimeInMillis() ;

        if(textFile != null) {
        	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
    		FileOutputStream fos = new FileOutputStream(textFile);
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    		bw.write((end - start) + " ms\n");
    		bw.newLine();
    		bw.newLine();
    		bw.newLine();
    		bw.close();
        }
	    
	    System.out.print((end - start) + " ms\n");
	}

}
