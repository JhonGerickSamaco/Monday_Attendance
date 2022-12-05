import java.util.Scanner;
public class Number_3 {
	public static void main(String arg[]) {
    Scanner ab = new Scanner(System.in);
	System.out.print("enter  any calendar year :");
        int year = ab.nextInt();	     

    if(year %400 == 0)
        System.out.println(year+" is a leap year");
             else  if(year %100 == 0)
	    	    System.out.println(year+" is not a leap year");
                   	else if(year %4 == 0)                    
	    		        System.out.println(year+" is a leap year");
                     	    else 
	   		                    System.out.println(year+" is not a leap year");                       
 	                  
 	}
}
