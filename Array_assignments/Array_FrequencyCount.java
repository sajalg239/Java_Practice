class Array_FrequencyCount
{
	static void frequencyCount(int x[])
	{
		int[] a=new int[x.length];
		int flag=1,k=-1,i,j,temp;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(x[i]!=a[j])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				a[++k]=x[i];
		}
		temp=0;
		System.out.println("Item\tElement");
		for(i=0;i<=k;i++)
		{
			for(j=0;j<x.length;j++)
				if(a[i]==x[j])
					++temp;
			System.out.println(a[i]+"\t"+temp);
			temp=0;
		}
	}
	public static void main(String... args)
	{
		frequencyCount(new int[]{1,2,5,3,1,2,6,5,2,9,2});
	}
}