package shestakov;

public class Factorial {
	
	int result;
	
	public Factorial() {
		
		this.result = 1;
		
	}
	
	public static void main(String[] args) {
		
		for(String arg: args) {
			
			int x = Integer.parseInt(arg);
				
			Factorial factorial = new Factorial();
				
			if(x>=0 && x%1==0) {
					
				factorial.calculate(x);
				
				factorial.showMessage(x);
					
			} else {
					
				factorial.showError();
					
			}
		}
	}
	
	public void calculate(int x) {
		
		if(x!=0) {
			
			for(int i=1;i<=x;i++) {
			
			this.result = this.result * i;
			
			}
		}
	}

	public void showMessage(int x) {
		
		System.out.println("!" + x + " = " + this.result);
		
	}
	
	public void showError() {
		
		System.out.println("Incorrect value");
		
	}
}
	
