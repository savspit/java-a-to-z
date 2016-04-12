package shestakov;

public class ArrayWithDuplicates {
	
	public static void main(String[] args) {
		
		ArrayWithDuplicates arrayWithDuplicates	= new ArrayWithDuplicates();
		
		String[] values = arrayWithDuplicates.initializeArray();
		
		arrayWithDuplicates.showArrayBefore(values);
		
		String[] correctArray = arrayWithDuplicates.removeDuplicates(values);
		
		arrayWithDuplicates.showArrayAfter(correctArray);
		
	}
	
	public String[] removeDuplicates(String[] values) {
		
		boolean duplicate = false;
		int n = 0;
		
		String[] correctValues = new String[values.length];
		
		for (String value: values) {
			
			for (String correctValue: correctValues) {
				
				if (value == correctValue) {
					
					duplicate = true;
					
					break;
					
				}
			
			}
			
			if (duplicate == false) {
				
				correctValues[n] = value;
				
				n++;
				
			} else {
				
				duplicate = false;
				
			}
			
		}
		
		return correctValues;
		
	}
	
	public String[] initializeArray() {
		
		String[] values = new String[10];
		
		values[0] = "apple";
		values[1] = "banana";
		values[2] = "pineapple";
		values[3] = "tomato";
		values[4] = "tomato";
		values[5] = "apple";
		values[6] = "peach";
		values[7] = "potato";
		values[8] = "strawberry";
		values[9] = "blueberry";
		
		return values;
		
	}
	
	public void showArrayBefore(String[] values) {
		
		System.out.println("*Before");
		
		for (String value : values) {
			
			System.out.println(value);
			
		}
		
	}
	
	public void showArrayAfter(String[] values) {
		
		System.out.println("*After");
		
		for (String value : values) {
			
			System.out.println(value);
			
		}
		
	}
	
}