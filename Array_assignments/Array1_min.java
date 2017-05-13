class Array1_min
{
	static int min(int x[])
	{
		int mini;
		mini=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(mini>x[i])
				mini=x[i];
		}
	return(mini);
	}
	public static void main(String... s)
	{
		System.out.println(min(new int[]{12,25,68,45,99}));
	}
}