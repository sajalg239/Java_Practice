class Array_findMean
{
	static float findmean(int x[])
	{
		int sum=0;
		for (int i=0;i<x.length;i++)
			sum+=x[i];
		float mean=((float) sum)/((float)x.length);
		return mean;
	}
	public static void main(String... s)
	{
		System.out.println(findmean(new int[]{12,25,68,45,99}));
	}
}