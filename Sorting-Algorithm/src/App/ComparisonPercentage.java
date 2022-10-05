package App;

public class ComparisonPercentage {
	
	public int percentage(int insertionSort, int quickSort) {
		
		//Vältetään 0:lla jakaminen 
		if(insertionSort == 0) {
			insertionSort = 1;
		}
		
		if(quickSort == 0) {
			quickSort = 1;
		}
		
		int result = (insertionSort / quickSort) * 100;
		
		return result;
	}
	
}
