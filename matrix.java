import java.util.*;
class matrix
{
	public static void main(String args[])
	{
		int r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows of first matrix:");
		r1=sc.nextInt();
		System.out.println("Enter the no of coloums of first matrix:");
		c1=sc.nextInt();
		System.out.println("Enter the no of rows of second matrix:");
		r2=sc.nextInt();
		System.out.println("Enter the no of coloums of second matrix:");
		c2=sc.nextInt();
		System.out.println("Enter the first matrix:");
		int[][] m1=new int[r1][c1];
		int[][] m2=new int[r2][c2];
		int[][] add=new int[10][10];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix elements are:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(m2[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Sum of matrices:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				add[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
