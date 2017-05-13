class Array_mergesort
{
	static void mergesort(int x[],int y[])
	{
		int temp,i,j,count=0;
		int z[]=new int[x.length+y.length];
		for(i=0;i<x.length;i++)
		{
			z[i]=x[i];
			count++;
		}
		for(i=0;i<y.length;i++)
		{
			z[count++]=y[i];
		}
		for(i=0;i<z.length;i++)
		{
			for(j=0;j<z.length-i-1;j++)
			{
				if(z[j]>z[j+1])
				{
					temp=z[j];
					z[j]=z[j+1];
					z[j+1]=temp;
				}
			}
		}
		for(i=0;i<z.length;i++)
			System.out.print(z[i]+"\t");
	}
	public static void main(String... s)
	{
		mergesort(new int[]{12,25,10,68,45,99},new int[]{36,20,95,77,66,22});
	}
}