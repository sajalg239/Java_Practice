class Array_findMedian
{
	static float findmedian(int x[])
	{
		float median=0;
		if(x.length%2==0)
		{
			int indexA=(x.length-1)/2;
			int indexB=x.length/2;
			median=((float)(x[indexA]+x[indexB]))/2;
		}
		else  
		{
			int index=(x.length-1)/2;
			median=x[index];
		}
		return median;
	}
	public static void main(String... s)
	{
		System.out.println(findmedian(new int[]{12,25,68,45,99}));
	}
}