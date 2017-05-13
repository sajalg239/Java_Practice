class Array_matrixTriangleA_sum
{
	static void Array_matrixTriangleA_sum(int x[][])
	{
		int sum=0,i,j;
		System.out.println("matrix is as follows");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("triangleA in matrix");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				if(i<=j)
					System.out.print(x[i][j]+"\t");
				else
					System.out.print("0"+"\t");
			}
			System.out.println();
		}
		System.out.println("sum of triangleA elements in matrix ");
		for(i=0;i<x.length;i++)
		{
			for(j=i;j>=0;j--)
			{
				sum=sum+x[j][i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String... s)
	{
		Array_matrixTriangleA_sum(new int[][]{{10,2,7},{24,3,4},{33,14,9}});
	}
}