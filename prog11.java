import java.util.*;
import java.lang.*;
import java.io.*;
class powern
{
	public static void main(String[] args) 
	{   
		Scanner ob = new Scanner(System.in);
   		int base = ob.nextInt();
  		int k = ob.nextInt();
  	        int result =(int) Math.pow(base, k);
    	System.out.println(+result);
    }
}
