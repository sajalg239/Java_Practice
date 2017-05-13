class Array_findMode
{
	static float findmode(int x[])
	{
		int modeCount = 0;	
		int mode = 0;		
		int currCount = 0;	
		int currElement;
		for (int candidateMode : x)
		{
			currCount = 0;
			for (int element : x)
				if (candidateMode == element)
					currCount++;
			if (currCount > modeCount)
			{
				modeCount = currCount;
				mode = candidateMode;
			}
		}
		
		return mode;
	}
	public static void main(String... s)
	{
		System.out.println(findmode(new int[]{12,25,68,45,99}));
	}
}