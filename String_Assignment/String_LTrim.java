class String_LTrim
{
	static String lTrim(String s)
	{
		int start=0,i;
		StringBuffer sb=new StringBuffer();
		for (i=0;i<s.length();i++)
			if (s.charAt(i)==' ')
				start++;
			else
				break;
		for (i=start;i<s.length();++i)
			sb.append(s.charAt(i));
		return sb.toString();
	}
	public static void main(String... args)
	{
		System.out.print("sajal"+lTrim("   Sajal Gupta   "));
	}
}