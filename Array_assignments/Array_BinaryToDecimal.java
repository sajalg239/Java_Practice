import java.lang.Math;
class Array_BinaryToDecimal
{
	static void binaryToDecimal(int x[])
	{
		for(int i=0;i<x.length;i++)
			if(x[i]!=1&&x[i]!=0)
				return;
		int temp=x.length,digitalno=0;
		for(int i=0;i<x.length;i++){
			temp--;
			if(x[i]==1)
				digitalno+=x[i]*Math.pow(2,temp);
		}
		System.out.println(digitalno);
	}
	public static void main(String... args)
	{
		binaryToDecimal(new int[]{1,0,1,0});
	}
}