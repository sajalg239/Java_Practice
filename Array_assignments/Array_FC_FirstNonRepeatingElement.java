class Array_FC_FirstNonRepeatingElement
{
	static void firstnonrepeatingelement(int x[])
	{
		int y[]=new int[x.length];
		int flag=1,k=-1,i,j,temp;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<y.length;j++)
				if(x[i]!=y[j])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			if(flag==1)
				y[++k]=x[i];
		}
		temp=0;
		for(i=0;i<=k;i++)
		{
			for(j=0;j<x.length;j++)
				if(y[i]==x[j])
					++temp;
			if(temp==1)
			{
				System.out.println(y[i]);
				return;
			}
			else
				temp=0;
		}
	}
	public static void main(String... s)
	{
		firstnonrepeatingelement(new int[]{12,25,68,25,12,99,45,99});
	}
}