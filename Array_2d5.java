package array_2d;

import java.util.Scanner;

public class Array_2d5
{
	public static void main(String[] kk)
	{
	  int i,j,ar1,ac1,br1,bc1;
	     int[][] a=new int[2][2];
    	System.out.println("ent rows and column size for a 2-d a arry");
    	Scanner x=new Scanner (System.in);
    	ar1=x.nextInt();
    	ac1=x.nextInt();
    	System.out.println("ent "+ar1*ac1+" elements to  read into a 2-d array");
    	for(i=0; i<ar1; i++)
    	{
    		for(j=0; j<ac1; j++)
    		{
    			a[i][j]=x.nextInt();
    		}
    	}
    	int[][] b=new int[2][2];
    	System.out.println("ent rows and column size for b 2-d a arry");
    	br1=x.nextInt();
    	bc1=x.nextInt();
    	System.out.println("ent "+br1*bc1+" elements to  read into b 2-d array");
    	for(i=0; i<br1; i++)
    	{
    		for(j=0; j<bc1; j++)
    		{
    			b[i][j]=x.nextInt();
    		}
    	}
    	int[][] c=new int[2][2];
	 for(i=0; i<ar1; i++)
	 {
		 for(j=0; j<ac1; j++)
		 {
			 c[i][j]=a[i][j]+b[i][j];
		 }
	 }
	 System.out.println("sum of two matrixes is");
	 for(i=0; i<ar1; i++)
	 {
		 for(j=0; j<ac1; j++)
		 {
			System.out.print(c[i][j]+" ");
		 }
		 System.out.println(  );
	 }
	}
}
