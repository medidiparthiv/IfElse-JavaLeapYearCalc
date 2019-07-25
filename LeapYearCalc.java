import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.print("Enter Year : ");
	    int a = x.nextInt();
	    
	    if (a%4==0){
	        System.out.println("The Year Entered is a Leap Year");
	    }
	    else {
	        System.out.print("The Year Entered is not a Leap Year");
	    }
	}
}