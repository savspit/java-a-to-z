package shestakov;

public class SquareArray {
	
	public static void main(String[] args) {
		
		SquareArray squareArray = new SquareArray();
		
		int[][] values = squareArray.initializeArray();
		
		squareArray.showArrayBefore(values);
		
		int[][] rotatedArray = squareArray.rotateArray(values);
		
		squareArray.showArrayAfter(rotatedArray);
		
	}
	
	public int[][] rotateArray(int[][] values) {
		
		int a = 0;
		int b = 0;
		
		int[][] rotatedArray = new int[5][5];
		
		for (int y=0;y<=values.length-1;y++) {
			
			for (int x=values.length-1;x>=0;x--) {
			
				rotatedArray[a][b] = values[x][y];
			
				b++;
				
			}
			
			a++;
			
			b=0;
			
		}
		
		return rotatedArray;
		
	}
	
	public int[][] initializeArray() {
		
		int temp = 0;
		
		int[][] values = new int[5][5];

		for (int x=0;x<values.length;x++) {
			
			for (int y=0;y<values.length;y++) {
			
				values[x][y] = temp;
				
				temp++;
				
			}
			
		}
		
		return values;
		
	}
	
	public void showArrayBefore(int[][] values) {
		
		System.out.println("Before");
		
		String str = "";
		
		for (int x=0;x<values.length;x++) {
			
			str = "";
			
			System.out.println(str);
			
			for (int y=0;y<values.length;y++) {
			
				str = str + values[x][y] + " ";
				
			}
			
			System.out.println(str);
			
		}	
		
	}
	
	public void showArrayAfter(int[][] values) {
		
		System.out.println("After");
		
		String str = "";
		
		for (int x=0;x<values.length;x++) {
			
			str = "";
			
			System.out.println(str);
			
			for (int y=0;y<values.length;y++) {
			
				str = str + values[x][y] + " ";
				
			}
			
			System.out.println(str);
			
		}	
		
	}
	
}