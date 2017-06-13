class String_RTrim
{
	static String rTrim(String s)
	{
		int end=s.length(),i;
		StringBuffer sb=new StringBuffer();
		for (i=s.length()-1;i>=0;i--)
			if (s.charAt(i)==' ')
				end--;
			else
				break;
		for(i=0;i<end;++i)
			sb.append(s.charAt(i));
		return sb.toString();
	}
	public static void main(String... args)
	{
		System.out.print(rTrim("Sajal gupta   ")+"sajal");
	}
}