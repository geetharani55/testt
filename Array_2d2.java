package array_2d;
import java.util.Scanner;
public class Array_2d2
{
	public static void main(String[] kk)
	 {
		int i,j;
		int[][] a=new int[2][2];
		int[][] b=new int[2][4];
	   System.out.println(" enr 4 elements to read into a 2-d array");
	   Scanner x=new Scanner(System.in);
	   for(i=0; i<2; i++) 
	   {
		   for(j=0; j<2; j++)
		   {
			   a[i][j] =x.nextInt();
		   }
		}
	   System.out.println("ent 8 elements to read b 2-d array");
	   for(i=0; i<2; i++)
	   {
		   for(j=0; j<4; j++)
		   {
			   b[i][j]=x.nextInt();
		   }
	   }
	   System.out.println("a 2-d array stored elements are ");
	   for(i=0; i<2; i++)
	   {
		   for(j=0; j<2; j++)
		    {
			   System.out.print(a[i][j]+"    ");
			 }
		   System.out.println(" ");
	   }
	   System.out.println(" b 2-d array stored elements are");
	   for(i=0; i<2; i++)
	      {
		      for(j=0; j<4;  j++)
		        {
			       System.out.print(b[i][j]+"    ");
		        }
		      System.out.println( " ");
	      }
	}

}
