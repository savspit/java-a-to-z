package shestakov;

import java.math.*;

public class Triangle {
   public Point a;
   public Point b;
   public Point c;

   public Triangle(Point a, Point b, Point c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public double area() {
      
	  double lenghtFirst = this.a.distanceTo(this.b);
	  double lenghtSecond = this.b.distanceTo(this.c);
	  double lenghtThird = this.c.distanceTo(this.a);
	  
	  double p = (lenghtFirst + lenghtSecond + lenghtThird) / 2;
	  
	  double area = Math.sqrt(p*(p-lenghtFirst)*(p-lenghtSecond)*(p-lenghtThird));
	  
      return area;
   }
   
   public static void main (String[] args) {
	   
	   Point a = new Point(2,10);
	   Point b = new Point(10,5);
	   Point c = new Point(20,30);
	   
	   Triangle triangle = new Triangle(a,b,c);
	   
	   if (triangle.canCreate()) {
		   
		    // area
		   
			double area = triangle.area();
	   
			Triangle.showArea(area); 
			
			// max lenght

			Service service = new Service();
			
			double max = service.max(triangle);
			
			Triangle.showMax(max);
		   
	   } else {
			   
			Triangle.showError();   
			   
		   }	   
   }
   
   public boolean canCreate() {
	   
	  if ((this.a.x == this.b.x) || (this.b.x == this.c.x) || (this.c.x == this.a.x)) {
		  
		  return false;
		  
	  } else if ((this.a.y == this.b.y) || (this.b.y == this.c.y) || (this.c.y == this.a.y)) {
		  
		  return false;
		  
	  } else if (this.a.equals(this.b) || this.b.equals(this.c) || this.c.equals(this.a)) {
				  
		  return false;
		  
	  } else {
		  
		  return true;
		  
	  }
   }
   
   public static void showMax(double max) {
	   
	   System.out.println("Max lenght: " + max);
	   
   }  
   public static void showArea(double message) {
	   
	   System.out.println("Area of triangle: " + message);
	   
   }
   
   public static void showError() {
	   
	   System.out.println("Triangle is incorrect");
	   
   }
}