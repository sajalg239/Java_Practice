class Array2_sort
{
	static void sort(int x[][])
	{
		int temp,i=0,j,c=-1;
		int y[]= new int[x.length*x[i].length];
		for(i=0;i<x.length;i++)
			for(j=0;j<x[0].length;j++)
			y[++c]=x[i][j];
		for(i=0;i<x.length;i++)
			for(j=y.length-1;j>i;j--)
				if(y[j]<y[j-1])
				{
					temp=y[j];
					y[j]=y[j-1];
					y[j-1]=temp;
				}
		System.out.println("after sorting");
		c=-1;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[0].length;j++)
				System.out.print("\t"+y[++c]);
			System.out.println();
		}
	}
	public static void main(String... s)
	{
		sort(new int[][]{{12,25,10},{36,54,87}});
	}
}