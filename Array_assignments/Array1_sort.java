class Array1_sort
{
	static void sort(int x[])
	{
		int temp,i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length-i-1;j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		for(i=0;i<x.length;i++)
			System.out.println(x[i]+"\t");
	}
	public static void main(String... s)
	{
		sort(new int[]{12,25,10,68,45,99});
	}
}