package test;

public class Add {
	public static void main(String args[])
	{
		long startTime = System.nanoTime();
		int sum = 0;
		int n=10_00_000;
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
}
