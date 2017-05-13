class Array_intersection
{
	static void intersection(int x[],int y[])
	{
		int length=0,k=-1,i,j,flag=1;
		if(x.length>y.length)
			length=y.length;
		else
			length=x.length;
		int z[]=new int[length];
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
			if(flag==1)
				z[++k]=x[i];
		}
		System.out.println("intersection of 2 arrays ia as follows:-");
		for(i=0;i<z.length;i++)
			if(z[i]!=0)
				System.out.print(z[i]+"\t");
	}
	public static void main(String... s)
	{
		intersection(new int[]{12,75,68},new int[]{12,68,95,77});
	}
}