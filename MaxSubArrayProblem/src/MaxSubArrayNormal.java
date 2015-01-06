
public class MaxSubArrayNormal {

	public static void main(String[] args) {

		int[] myIntArray = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		MaxSubArrayNormal m = new MaxSubArrayNormal();
		int result = m.getResult(myIntArray);
		System.out.println("Max value = "+result);
	}
	public static int getResult(int [] array)
	{
		int sum = 0;
		int max = 0;
		for(int i=0;i<array.length ;i++)
		{
			sum=0;
			for(int j=i;j<array.length ;j++)
			{
				sum = sum + array[j];
				if(sum > max)
					max = sum;
			}
		}
		return max;
	}
}

