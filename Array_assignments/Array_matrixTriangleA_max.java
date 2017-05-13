class Array_matrixTriangleA_max
{
	static void Array_matrixTriangleA_max(int x[][])
	{
		int sum=0,i,j,max;
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
		System.out.println("maximum element in triangleA in matrix ");
		max=x[0][0];
		for(i=0;i<x.length;i++)
			for(j=0;j>=0;j--)
				if(max<x[j][i])
					max=x[j][i];
		System.out.println(max);
	}
	public static void main(String... s)
	{
		Array_matrixTriangleA_max(new int[][]{{10,2,7},{24,3,4},{33,14,9}});
	}
}