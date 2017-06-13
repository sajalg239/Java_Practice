class String_Compare
{
	static int compare(String s1,String s2)
	{
		int as1,as2,shortlength=0,i;
		if(s1.length()<=s2.length())
			shortlength=s1.length();
		else if(s1.length()>s2.length())
			shortlength=s2.length();
		for(i=0;i<shortlength;i++)
			if(s1.charAt(i)!=s2.charAt(i))
			{
					as1=s1.charAt(i);
					as2=s2.charAt(i);
					return as1-as2;
			}
			return s1.length()-s2.length();
	}
	public static void main(String... args) 
	{
		System.out.print(compare("sajal gupta","sajal"));
	}
}
