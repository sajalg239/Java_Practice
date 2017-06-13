class String_Squeeze
{
	static String squeeze(String s)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)!=' ')
				sb.append(s.charAt(i));
		return  sb.toString();
	}
	public static void main(String... args)
	{
		System.out.print(squeeze("Sajal Gupta"));
	}
}