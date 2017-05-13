class Array_matrixsum
{
	static void matrixsum(int x[][])
	{
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		int rowsum[],colsum[];// horizontal,vertical;
		int diagsum[]=new int[]{0,0};
		colsum=new int[x.length];
		rowsum=new int[x.length];
		int temp=x.length-1;
		for(int i=0;i<x.length;i++)
		{
			colsum[i]=0;
			rowsum[i]=0;
			for(int j=0;j<x[i].length;j++)
			{
				colsum[i]+=x[i][j];
				rowsum[i]+=x[j][i];
			}
		}
		for(int i=0;i<x.length;i++)
		{
			diagsum[0]+=x[i][i];
			diagsum[1]+=x[i][temp-i];
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
				System.out.print("\t"+x[i][j]);
			System.out.println("\t"+colsum[i]);
		}
		System.out.print("\n"+diagsum[0]+"\t");
		for(int i=0;i<x.length;i++)
			System.out.print(rowsum[i]+"\t");
		System.out.print(diagsum[1]);
	}
	public static void main(String... s)
	{
		matrixsum(new int[][]{{12,25,68},{36,54,87},{10,47,66}});
	}
}