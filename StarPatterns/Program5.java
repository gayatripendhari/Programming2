/*
D:\JAVA\Programming\StarPatterns>java Program5.java
* * * *
      *
      *
* * * *

*/

public class Program5 {
    public static void main(String[] args) 
	{
		int num=4;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i==1 || i==4 || j==4 )
				{
					System.out.print("* ");
				}
					else{
						System.out.print("  ");
					}
				}
		System.out.println();
	}
}
}
