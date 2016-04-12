package shestakov;

public class BubbleSortArray {
	
	public static void main(String[] args) {
	
		BubbleSortArray bubbleSortArray = new BubbleSortArray();
	
		int[] values = bubbleSortArray.initializeArray();
		
		bubbleSortArray.showArrayBefore(values);
		
		bubbleSortArray.doBubbleSort(values);
		
		bubbleSortArray.showArrayAfter(values);
	
	}
	
	public void doBubbleSort(int[] values) {
		
		for (int x=0;x<values.length-1;x++) {
			
			for (int y=0;y<values.length-1-x;y++) {
				
				if (values[y] > values[y+1]) {
					
					int temp = values[y];
					
					values[y] = values[y+1];
					
					values[y+1] = temp;
					
				}
				
			}
			
		}
		
	}
	
	public int[] initializeArray() {
		
		int[] values = new int[10];
		
		values[0] = 9;
		values[1] = 6;
		values[2] = 5;
		values[3] = 10;
		values[4] = 7;
		values[5] = 3;
		values[6] = 8;
		values[7] = 2;
		values[8] = 1;
		values[9] = 4;
		
		return values;
		
	}
	
	public void showArrayBefore(int[] values) {
		
		System.out.println("Before");
		
		for (int value : values) {
			
			System.out.println(value);
			
		}
		
	}
	
	public void showArrayAfter(int[] values) {
		
		System.out.println("After");
		
		for (int value : values) {
			
			System.out.println(value);
			
		}
		
	}
	
}