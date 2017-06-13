class String_Find
{
	static boolean find(String s1,String s2)
	{
		boolean flag=true;
		int i,j;
		for(i=0;i<s1.length();i++)
		{
			flag=true;
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i+j)!=s2.charAt(j))
				{
					flag=false;
					j=s2.length();
				}
			}
			if(flag==true)
				return flag;
		}
		return flag;
	}
	public static void main(String... args)
	{
		System.out.print(find("sajal gupta","sajal"));
	}
}