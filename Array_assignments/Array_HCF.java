class Array_HCF
{
	static void HCF(int x[])
	{
		int temp=x[0];
		for(int i=1;i<x.length;i++)
			if(x[i]>temp)
				temp=x[i];
		for(int i=0;i<x.length;i++)
			temp=hcf2(temp,x[i]);
		System.out.println(temp);
	}
	static int hcf2(int a,int b)
	{
		int c=(a>b)?a:b;
		int d=(a<b)?a:b;
		int e=d;
		while(c%d!=0)
		{
			e=c%d;
			c=d;
			d=e;
		}
		return e;
	}
	public static void main(String... s)
	{
		HCF(new int[]{12,25,68,45,99});
	}
}