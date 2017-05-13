class Array_Shift
{
	static void shift(int x[])
	{
		int i,j,temp,tempindex;
		for(i=0;i<x.length-1;i++)
            for(j=x.length-1;j>i;j--)
                if(x[j]<x[j-1])
				{
                    temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                }
		tempindex=-1;
		for(i=0;i<x.length;i++)
		{
			if(x[i]<0)
				tempindex++;
			else
				break;
		}
		for(i=0;i<tempindex;i++)
            for(j=tempindex;j>i;j--)
                if(x[j]>x[j-1])
				{
                    temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                }
		System.out.print(x[0]);
		for(i=1;i<x.length;i++)
            System.out.print(","+x[i]);
	}
	public static void main(String... args)
	{
		shift(new int[]{-1,1,-2,-9,10,2,-3,6,3,-4,4,0});
	}
}