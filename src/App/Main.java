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
        
        //Kierrosten määrä kaikkien taulukoiden kokojen läpikäymiseen
        int rounds = 3;
        
        //Vaihtoehto tallentaa tulokset tekstitiedostoon (ja alempana tiedoston path)
        boolean saveResultToTextFile = true;
        File tempDirectory = new File("C:\\Tietorakenne");
        if(!tempDirectory.exists() && saveResultToTextFile != false) {
        	tempDirectory.mkdirs();
        }
        
        String textFilePath = "C:\\Tietorakenne\\InsertionSort_VS_QuickSort.txt";
        File textFile = null;
        
        if(saveResultToTextFile) {
        	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        	textFile = new File(textFilePath);
    		FileOutputStream fos = new FileOutputStream(textFile);
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    		bw.write("------------------------------------------------------------------------");
    		bw.newLine();
    		bw.write("Results for Insertion Sort & Quick Sort comparison");
    		bw.newLine();
    		bw.write("------------------------------------------------------------------------");
    		bw.newLine();
    		bw.close();
        }
        
        for(int i = 0; i < rounds; i++) {
        	
            if(saveResultToTextFile) {
            	//Tätä koodia käytetään vain, jos tallennetaan tulos tekstitiedostoon
        		FileOutputStream fos = new FileOutputStream(textFile);
        		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	    		bw.write("Round " + (i + 1));
	    		bw.newLine();
	    		bw.close();
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

            cs.execute(insertionSortArray1, quickSortArray1, textFile);
            cs.execute(insertionSortArray2, quickSortArray2, textFile);
            cs.execute(insertionSortArray3, quickSortArray3, textFile);
            cs.execute(insertionSortArray4, quickSortArray4, textFile);
            cs.execute(insertionSortArray5, quickSortArray5, textFile);
        }
        
	}

}
