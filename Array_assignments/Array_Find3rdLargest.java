class Array_Find3rdLargest
{
	static void find3rdLargest(int x[])
	{
		if(x.length<3)
			return;
		int a=0,b=0,c=0;
		for(int i=0;i<x.length;i++)
		{
			if(a<x[i])
			{
				c=b;
				b=a;	
				a=x[i];
			}
			else if(b<x[i])
			{
				c=b;
				b=x[i];
			}
			else if(c<x[i])
				c=x[i];
		}
		System.out.print(c);
	}
	public static void main(String... args)
	{
		find3rdLargest(new int[]{1,4,3,9,11,7,6});
	}
}