class String_CharacterCount
{
	static int charCount(String s)
	{
		int temp=0,i;
		for(i=0;i<s.length();i++)
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z'))
				temp++;
		return temp;
	}
	public static void main(String... args)
	{
		System.out.print(charCount("sajal"));
	}
}