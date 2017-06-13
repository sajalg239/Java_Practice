class String_AllTrim
{
	static String allTrim(String s)
	{
		int start=0,end=s.length(),i;
		StringBuffer sb=new StringBuffer();
		for(i=0;i<s.length();i++)
			if (s.charAt(i)==' ')
				start++;
			else
				break;
		for(i=s.length()-1;i>=0;i--)
			if (s.charAt(i)==' ')
				end--;
			else
				break;
		for(i=start;i<end;++i)
			sb.append(s.charAt(i));
		return sb.toString();
	}
	public static void main(String... args)
	{
		System.out.print(allTrim("   Sajal Gupta   "));
	}
}