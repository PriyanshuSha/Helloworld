// this is a program for number pattern 9 19 29 ......129


class patternNum
{
	public static void main(String args[])
	{
		for (int i = 8; i<=129; i++)
		{

			System.out.print((i+1)+" ");// prints number by adding 1
			
			i+=9;//  we add 9 in i
		}
	}
 } 