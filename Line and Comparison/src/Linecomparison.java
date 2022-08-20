
public class Linecomparison {
 
	 public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program");
	
				int x1=1;
				int y1=1;
				int x2=5;
				int y2=5;
				
			double Distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)) ;
			System.out.println("Distance between = "+"("+x1+","+y1+"),"+"("+x2+","+y2+") "+Distance);
			
			int lengthline1=2;
			int lengthline2=2;
			int d1= (int)(lengthline1);
			int d2= (int)(lengthline2);
			if (d1 ==d2)
			     System.out.println("Line 1 and Line 2 have equal Length.");
			else
				 System.out.println("Line 1 and Line 2 have do not have equal length.");
			
	   
				
				int numline1=10; 
				int numline2=20;
				
				boolean result = numline1 < numline2 ;
				
			     System.out.println(result);
			     System.out.println(numline1 == numline2);
			     System.out.println(numline1 > numline2);
			     System.out.println(numline1 < numline2);
			     System.out.println(numline1 >= numline2);
			     
		       	} 
		    }
			     
