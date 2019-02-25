import java.util.*;
import java.lang.*;
import java.io.*;
class oddnum
{
	public static void main(String[] args) 
	{   
		Scanner ob = new Scanner(System.in);
        	int a=ob.nextInt();
        	int b=ob.nextInt();
       		for (int i=a; i<b;)
        	{
        		++i;
        		if(i!=b)
        		{
           		 if( i % 2 != 0)
            		{
				System.out.print(i+" ");
           	        }
        		}
        	}
	}
}  
