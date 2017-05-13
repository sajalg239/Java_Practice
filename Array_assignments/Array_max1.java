class Array1_max
{
	static int max(int x[])
	{
		int maxx;
		maxx=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(maxx<x[i])
				maxx=x[i];
		}
	return(maxx);
	}
	public static void main(String... s)
	{
		System.out.println(max(new int[]{12,25,68,45,99}));
	}
}
