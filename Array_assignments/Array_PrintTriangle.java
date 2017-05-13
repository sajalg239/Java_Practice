class Array_printtriangle
{
	static void printtriangle(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(x[j]+"\t");
			System.out.println();
		}
	}
	public static void main(String... s)
	{
		printtriangle(new int[]{12,25,68,45,99});
	}
}