package jisuanke;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		int M = sc1.nextInt();
		int N = sc1.nextInt();
		int T = sc1.nextInt();
		
		int[][] arr = new int[M][N];
		//输入
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)	
			{
				arr[i][j] = sc1.nextInt();
			}
		}
		//反转
		if(T==0)
		{
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)	
				{
					System.out.print(arr[i][M-1-j]);
					if(M-1-i==0)
					{
						continue;
					}
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
		else if(T==1)
		{
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < M; j++)
				{
					System.out.print(arr[N-1-i][j]);
					if(j==3)
					{
						continue;
					}
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
		
	}

}







