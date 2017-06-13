class String_Palindrome
{
	static boolean palindrome(String s)
	{
		int start=0,end=s.length()-1;
		while(start<=end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;
				start++;  end--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(palindrome("Sajal"));
		System.out.print(palindrome("nitin"));
  }
}