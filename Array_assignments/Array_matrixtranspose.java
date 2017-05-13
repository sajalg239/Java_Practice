class Array_matrixtranspose
{
	static void matrixtranspose(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
				System.out.print(x[j][i]+"\t");
			System.out.println();
		}
	}
	public static void main(String... s)
	{
		matrixtranspose(new int[][]{{12,25,68},{36,54,87},{10,47,66}});
	}
}