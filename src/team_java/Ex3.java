package team_java;

public class Ex3 
{
	public static void main(String[] args)
	{
		int flag_sign = -1;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			flag_sign = flag_sign * (-1);
			System.out.print(i * flag_sign);
			System.out.print(" ");
			sum = sum + (i * flag_sign);
		}
		System.out.println();
		System.out.print("°á°ú: ");
		System.out.println(sum);
	}
}
