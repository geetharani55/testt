package array_2d;
import java.util.Scanner;
public class Array_2d1 
{
	 public static void main(String[] kk)
	 {
		 int i,j;
		 int[][]  a=new int[3][2];
		 Scanner x=new Scanner(System.in);
		 System.out.println("ent 6 elements to read into  a 2d array");
		 for(i=0; i<3; i++)
		 {
			 for(j=0; j<2; j++)
			 {
				 a[i][j]=x.nextInt();
			 }
		 }
		 System.out.println("a 2d array stored ele are");
		 for(i=0; i<3; i++)
		 {
			 for(j=0; j<2; j++)
			 { 
				System.out.print(a[i][j]+"  ");
			 }
			 System.out.println(" \t");
			 
		 }
	 }

}
