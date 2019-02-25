import java.util.*;
import java.lang.*;
import java.io.*;
class palindrome
{
	public static void main(String[] args) 
	{   
		Scanner ob = new Scanner(System.in);
		int temp,sum=0,a;
   	int n = ob.nextInt();
  	temp=n;
           while(n>0)
          {    
            a=n%10;  
            sum=(sum*10)+a;    
            n=n/10;    
           }    
     if(temp==sum)    
        System.out.println("yes");    
     else    
        System.out.println("no");    
	}
}  
