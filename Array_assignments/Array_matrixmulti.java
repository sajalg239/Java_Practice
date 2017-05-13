class Array_matrixmulti
{
	static void matrixmulti(int x[][],int y[][])
	{
		int temp,i,j;
		if(x.length==y[0].length)
		{
			int z[][]=new int[x.length+y.length][x[0].length+y[0].length];
			System.out.println("First matrix is as follows:-\n");
			for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[0].length;j++)
				{
					System.out.print(x[i][j]+"\t");
				}
				System.out.print("\n");
			}
			System.out.println("Second matrix is as follows:-\n");
			for(i=0;i<y.length;i++)
			{
				for(j=0;j<y[0].length;j++)
				{
					System.out.print(y[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("Multiplication of two matrix is as follows:-");
			for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[0].length;j++)
				{
					z[i][j]=x[i][j]*y[j][i];
				}
			}
			for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[0].length;j++)
					System.out.print(z[i][j]+"\t");
				System.out.println();
			}
		}
		else
			System.out.println("multiplication of matrix is not possible");
	}
	public static void main(String... s)
	{
		matrixmulti(new int[][]{{12,25,10},{25,35,44},{5,6,4}},new int[][]{{36,20,45},{10,66,22},{9,7,8}});
	}
}