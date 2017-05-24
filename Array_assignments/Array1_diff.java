class Array1_diff
{
	static int diff(int x[])
	{
		int dif=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<x[i+1])
			{
				dif=x[i+1]-x[i];
				break;
			}
		}
	return(dif);
	}
	public static void main(String... s)
	{
		System.out.println(diff(new int[]{28,25,68,45,99}));
	}
}