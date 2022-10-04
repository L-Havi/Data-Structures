package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main{

	public static void main(String[] args) throws IOException{

        AssignRandomArray assignRnd = new AssignRandomArray();
        CompareSorts cs = new CompareSorts();
        ComparisonPercentage percentageCalc = new ComparisonPercentage();
        
        File textFile = null;
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        
        //Kierrosten määrä kaikkien taulukoiden kokojen läpikäymiseen
        int rounds = 3;
        
        //Vaihtoehto tallentaa tulokset tekstitiedostoon (true/false) ja hakemisto mihin tekstitiedosto tallennetaan
        boolean saveResultToTextFile = true;
        String textFileDirectory = "C:\\Tietorakenne";
        
        File tempDirectory = new File(textFileDirectory);
        if(saveResultToTextFile) {
        	if(!tempDirectory.exists()) {
            	tempDirectory.mkdirs();
        	}
            String textFilePath = textFileDirectory + "\\InsertionSort_VS_QuickSort.txt";
            textFile = new File(textFilePath);
            fos = new FileOutputStream(textFile);
        	bw = new BufferedWriter(new OutputStreamWriter(fos));
        }
        
        for(int i = 0; i < rounds; i++) {
        	
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
            	if(i == 0) {
            		bw.write("------------------------------------------------------------------------");
            		bw.newLine();
            		bw.write("Results for Insertion Sort & Quick Sort comparison");
            		bw.newLine();
            		bw.write("------------------------------------------------------------------------");
            		bw.newLine();
            	}
	    		bw.write("Round " + (i + 1));
	    		bw.newLine();

            }
            
            int[] insertionSortArray1 = assignRnd.randomArray(1000);
            int[] insertionSortArray2 = assignRnd.randomArray(10000);
            int[] insertionSortArray3 = assignRnd.randomArray(100000);
            int[] insertionSortArray4 = assignRnd.randomArray(1000000);
            //int[] insertionSortArray5 = assignRnd.randomArray(10000000);
            //Alkuperäinen assignRnd.randomArray(10000000) taulukko kestää ~15h järjestää
            int[] insertionSortArray5 = assignRnd.randomArray(1);

            int[] quickSortArray1 = assignRnd.randomArray(1000);
            int[] quickSortArray2 = assignRnd.randomArray(10000);
            int[] quickSortArray3 = assignRnd.randomArray(100000);
            int[] quickSortArray4 = assignRnd.randomArray(1000000);
            int[] quickSortArray5 = assignRnd.randomArray(10000000);

            int[] result = new int[2];
            int difference;
            
    	    System.out.println("\nSorting " + quickSortArray1.length + " integer array with insertion sort & quick sort"); 
            result = cs.execute(insertionSortArray1, quickSortArray1);
            difference = percentageCalc.percentage(result[0], result[1]);
    	    System.out.println("Insertion Sort: " + result[0] + " ms");
    	    System.out.println("Quick Sort: " + result[1] + " ms");
    	    System.out.println("Quick Sort is " + difference + "% faster than Insertion Sort");
            
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	    bw.write("\nSorting " + quickSortArray1.length + " integer array with insertion sort & quick sort");
        	    bw.newLine();
        	    bw.write("Insertion Sort: " + result[0] + " ms");
        	    bw.newLine();
        	    bw.write("Quick Sort: " + result[1] + " ms");
	    		bw.newLine();
        	    bw.write("Quick Sort is " + difference + "% faster than Insertion Sort");
	    		bw.newLine();
            }
    	    
    	    System.out.println("\nSorting " + quickSortArray2.length + " integer array with insertion sort & quick sort"); 
            result = cs.execute(insertionSortArray2, quickSortArray2);
            difference = percentageCalc.percentage(result[0], result[1]);
    	    System.out.println("Insertion Sort: " + result[0] + " ms");
    	    System.out.println("Quick Sort: " + result[1] + " ms");
    	    System.out.println("Quick Sort is " + difference + "% faster than Insertion Sort");
    	    
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	    bw.write("\nSorting " + quickSortArray2.length + " integer array with insertion sort & quick sort");
        	    bw.newLine();
        	    bw.write("Insertion Sort: " + result[0] + " ms");
        	    bw.newLine();
        	    bw.write("Quick Sort: " + result[1] + " ms");
	    		bw.newLine();
        	    bw.write("Quick Sort is " + difference + "% faster than Insertion Sort");
	    		bw.newLine();
            }
    	    
    	    System.out.println("\nSorting " + quickSortArray3.length + " integer array with insertion sort & quick sort"); 
            result = cs.execute(insertionSortArray3, quickSortArray3);
            difference = percentageCalc.percentage(result[0], result[1]);
    	    System.out.println("Insertion Sort: " + result[0] + " ms");
    	    System.out.println("Quick Sort: " + result[1] + " ms");
    	    System.out.println("Quick Sort is " + difference + "% faster than Insertion Sort");
    	    
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	    bw.write("\nSorting " + quickSortArray3.length + " integer array with insertion sort & quick sort");
        	    bw.newLine();
        	    bw.write("Insertion Sort: " + result[0] + " ms");
        	    bw.newLine();
        	    bw.write("Quick Sort: " + result[1] + " ms");
	    		bw.newLine();
        	    bw.write("Quick Sort is " + difference + "% faster than Insertion Sort");
	    		bw.newLine();
            }
    	    
    	    System.out.println("\nSorting " + quickSortArray4.length + " integer array with insertion sort & quick sort"); 
            result = cs.execute(insertionSortArray4, quickSortArray4);
            difference = percentageCalc.percentage(result[0], result[1]);
    	    System.out.println("Insertion Sort: " + result[0] + " ms");
    	    System.out.println("Quick Sort: " + result[1] + " ms");
    	    System.out.println("Quick Sort is " + difference + "% faster than Insertion Sort");
    	    
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	    bw.write("\nSorting " + quickSortArray4.length + " integer array with insertion sort & quick sort");
        	    bw.newLine();
        	    bw.write("Insertion Sort: " + result[0] + " ms");
        	    bw.newLine();
        	    bw.write("Quick Sort: " + result[1] + " ms");
	    		bw.newLine();
        	    bw.write("Quick Sort is " + difference + "% faster than Insertion Sort");
	    		bw.newLine();
            }
    	    
    	    System.out.println("\nSorting " + quickSortArray5.length + " integer array with insertion sort & quick sort"); 
            result = cs.execute(insertionSortArray5, quickSortArray5);
            difference = percentageCalc.percentage(result[0], result[1]);
    	    System.out.println("Insertion Sort: " + result[0] + " ms");
    	    System.out.println("Quick Sort: " + result[1] + " ms");
    	    System.out.println("Quick Sort is " + difference + "% faster than Insertion Sort");
    	    
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	    bw.write("\nSorting " + quickSortArray5.length + " integer array with insertion sort & quick sort");
        	    bw.newLine();
        	    bw.write("Insertion Sort: " + result[0] + " ms");
        	    bw.newLine();
        	    bw.write("Quick Sort: " + result[1] + " ms");
	    		bw.newLine();
        	    bw.write("Quick Sort is " + difference + "% faster than Insertion Sort");
	    		bw.newLine();
	    		bw.newLine();
	    		bw.newLine();
            }
            
        }
        if(bw != null) {
    		bw.close();
        }
	}

}
