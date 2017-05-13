class Array_union
{
	static void union(int x[],int y[])
	{
		int flag=1,k=-1,i,j,count=0;
		int z[]=new int[x.length+y.length];
		for(i=0;i<y.length;i++)
		{
			for(j=0;j<z.length;j++)
			{
				if(y[i]!=z[j])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				z[++k]=y[i];
		}
		flag=1;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<z.length;j++)
			{
				if(x[i]!=z[j])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				z[++k]=x[i];
		}
		System.out.println("union of 2 arrays ia as follows:-");
		for(i=0;i<z.length;i++)
			if(z[i]!=0)
				System.out.print(z[i]+"\t");
	}
	public static void main(String... s)
	{
		union(new int[]{12,25,12,68},new int[]{36,20,95,77});
	}
}