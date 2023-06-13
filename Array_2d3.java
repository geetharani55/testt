package array_2d;

import java.util.Scanner;

public class Array_2d3 
{
	public static void main(String[] kk)
	{
		 int i,j,n,rows,colums;
		 int[][] a=new int[10][10];
		 System.out.println("ent rows and columns size for a 2-d array");
		 Scanner x=new Scanner(System.in);
		 rows=x.nextInt();
		 colums=x.nextInt();
		 System.out.println("ent "+rows*colums+" elements to read into a 2-d array");
		   for(i=0; i<rows; i++)
		   {
			   for(j=0; j<colums; j++)
			   {
				   a[i][j]=x.nextInt();
			   }
		   }
		   System.out.println("a 2_d array stored elents are ");
		   for(i=0; i<rows; i++)
		   {
			   for(j=0; j<colums; j++)
			   {
				   System.out.print(a[i][j]+" ");
			   }
			   System.out.println(" ");
		   }
	}

}
