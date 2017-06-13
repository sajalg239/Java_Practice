class String_PrintNonRepeatingFirstChar
{
	static void printNonRepetingFirstChar(String s)
	{
		int temp,i,j;
		for (i=0;i<s.length();i++)
		{
			temp=0;
			for(j=i-1;j>=0;j--)
				if(s.charAt(i)==s.charAt(j))
					temp++;
			for(j=i+1;j<s.length();j++)
				if(s.charAt(i)==s.charAt(j))
					temp++;
			if(temp==0)
			{
				System.out.print(s.charAt(i));
				return ;
			}
		}
	}
	public static void main(String... args)
	{
		printNonRepetingFirstChar("nitin");
	}
}