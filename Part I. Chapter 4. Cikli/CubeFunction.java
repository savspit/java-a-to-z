package shestakov;

import java.math.*;

public class CubeFunction {
	
	int a;
	int b;
	int c;
	final int x1;
	final int x2;
	
	public CubeFunction(int a, int b, int c, int value1, int value2) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.x1 = value1;
		this.x2 = value2;
		
	}
	
	public static void main(String[] args) {
		
		CubeFunction cubefunction = new CubeFunction(5,6,10,Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		if (cubefunction.validParameters(args)) {
		
			cubefunction.calculate();
			
		}
		
	}
	
	public boolean validParameters(String[] args) {
		
		if (args.length != 2) {
			
			showMessage("Input 2 parameters");
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
	public void calculate() {
	
		float result = 0;
	
		if (this.x1 < this.x2) {
	
			for(int x=this.x1;x<=this.x2;x++) {
						
				result = (float)(this.a * Math.pow(x,2) + this.b * x + this.c);
	
				showMessage(Float.toString(result));
					
			} 
		} else {
	
				for(int x=this.x1;x>=this.x2;x--) {
						
					result = (float)(this.a * Math.pow(x,2) + this.b * x + this.c);
	
					showMessage(Float.toString(result));
						
				}
		}	
	
	}
	
	public void showMessage(String message) {
		
		System.out.println(message);
		
	}
	
}