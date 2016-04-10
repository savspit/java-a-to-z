package shestakov;

import java.math.*;

public class CubeFunction {
	
	int a;
	int b;
	int c;
	
	public CubeFunction(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public static void main(String[] args) {
		
		CubeFunction cubefunction = new CubeFunction(5,6,10);
		
		boolean firstElementPassed = false;
		boolean secondElementPassed = false;
		int firstValue = 0;
		int secondValue = 0;
		
		for(String arg : args) {
			
			if (firstElementPassed == false && secondElementPassed == false) {
				
				firstValue = Integer.parseInt(arg);
				
				firstElementPassed = true;
				
			} else if (firstElementPassed && secondElementPassed == false){
				
				secondValue = Integer.parseInt(arg);
				
				if (secondValue>firstValue) {
					
					for(int x=firstValue;x<=secondValue;x++) {
						
						float y = cubefunction.calculate(x);
						
						cubefunction.showMessage(y);
					
					} 
				} else {
					
						for(int x=firstValue;x>=secondValue;x--) {
							
							float y = cubefunction.calculate(x);
							
							cubefunction.showMessage(y);
						
						}
					
					}
				
				secondElementPassed = true;
				
				}
				
			}
			
		}
	
	public float calculate(int x) {
	
		return (float)(this.a * Math.pow(x,2) + this.b * x + this.c);
		
	}
	
	public void showMessage(float y) {
		
		System.out.println(y);
		
	}
	
}