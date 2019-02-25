import java.util.*;
import java.lang.*;
import java.io.*;
class primenum
{
	public static void main(String[] args) 
	{   
		Scanner ob = new Scanner(System.in);
		int flag=0,i;
   		int n = ob.nextInt();
  		for(i=1;i<=n;i++)
  		{
  		if((n%i)==0)
  		{
        	flag++;
      }    
  		}
  if(flag==2)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
	}
}  
