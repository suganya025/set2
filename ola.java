import java.util.*;
import java.lang.*;
import java.io.*;

class Ola
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner op=new Scanner(System.in);
		String startplace="",endplace="";
		int km,cost;
		int startkm=op.nextInt();
		int endkm=op.nextInt();
		System.out.println("1.auto\t2.car");
		int option=op.nextInt();
		
		switch(option)
		{
			case 1:
				km=endkm-startkm;
				cost=km*10;
				break;
			case 2:
				km=endkm-startkm;
				cost=km*14;
				break;
		}
		System.out.println("Source:"+startplace,"Destination:",+endplace,"kilo meter:"+km);
		System.out.println(+cost);

	}
}
