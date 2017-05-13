class Array_LCM
{
	static int lcm2(int a,int b)
	{
		int c=(a>b)?a:b;
		while(true)
		{
			if(c%a==0&&c%b==0)
				return c;
			++c;
		}
	}
	static void LCM(int x[])
	{
		int temp=1;
		for(int i=0;i<x.length;i++)
			temp=lcm2(temp,x[i]);
		System.out.println(temp);
	}
	public static void main(String... s)
	{
		LCM(new int[]{12,25,68,45});
	}
}