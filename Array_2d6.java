package array_2d;

import java.util.Scanner;

public class Array_2d6
{
	public static void main(String[] kk)
	{
		int i,j,k,ar,ac,br,bc,cr,cc;
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] c=new int[2][2];
		System.out.println("ent ar and ac size for a 2-d array");
		Scanner x= new Scanner(System.in);
		ar=x.nextInt();
		ac=x.nextInt();
	   System.out.println("ent"+ar*ac+"elements to read into a array");
		for(i=0; i<ar; i++)
		{
			for(j=0; j<ac; j++)
			{
				a[i][j]=x.nextInt();
			}
		}
		System.out.println("ent br and nc size for b 2-d array");
		br=x.nextInt();
		bc=x.nextInt();
		System.out.println("ent"+br*bc+"elemnts to read into b 2-d array");
		for(i=0; i<br; i++)
		{
			for(j=0; j<bc; j++)
			{
				b[i][j]=x.nextInt();
			}
		}
		for(i=0; i<ar; i++)
		  {
			  for(j=0; j<ac; j++)
			  {
				   c[i][j]=0;
				   for(k=0; k<ac; k++)
				   {
					   c[i][j]=c[i][j]+a[i][k]*b[k][j];
				   }
			  }
		}
		System.out.println("multiplication of two matrxes is ");
		for(i=0; i<ar; i++)
		{
			for(j=0; j<bc;  j++)
			  {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(  );
		}
	}
}
