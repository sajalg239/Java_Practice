class Array2_max
{
	static int max(int x[][])
	{
		int maxx;
		maxx=x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(maxx<x[i][j])
					maxx=x[i][j];
			}
		}
		return(maxx);
	}
	public static void main(String... s)
	{
		System.out.println(max(new int[][]{{12,25,68,45,99},{36,54,87,96,66}}));
	}
}