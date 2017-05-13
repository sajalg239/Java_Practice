class Array_matrixTriangleB_min
{
	static void Array_matrixTriangleB_min(int x[][])
	{
		int sum=0,i,j,min;
		System.out.println("matrix is as follows");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println();
		}
		System.out.println("triangleB in matrix");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
				if(i>=j)
					System.out.print(x[i][j]+"\t");
				else
					System.out.print("0"+"\t");
			System.out.println();
		}
		System.out.println("maximum element in triangleB in matrix ");
		min=x[0][0];
		for(i=0;i<x.length;i++)
			for(j=i;j>=0;j--)
				if(min>x[i][j])
					min=x[i][j];
		System.out.println(min);
	}
	public static void main(String... s)
	{
		Array_matrixTriangleB_min(new int[][]{{10,2,7},{24,3,4},{33,14,9}});
	}
}