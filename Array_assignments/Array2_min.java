class Array2_min
{
	static int min(int x[][])
	{
		int mini;
		mini=x[0][0];
		for(int i=1;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(mini>x[i][j])
					mini=x[i][j];
			}
		}
		return(mini);
	}
	public static void main(String... s)
	{
		System.out.println(min(new int[][]{{12,25,68,45,99},{36,54,87,96,66}}));
	}
}