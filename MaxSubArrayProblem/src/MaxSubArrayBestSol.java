
public class MaxSubArrayBestSol {

	public static void main(String[] args) {

		int[] myIntArray = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		MaxSubArrayBestSol m = new MaxSubArrayBestSol();
		int result = m.getResult(myIntArray);
		System.out.println("Max value = "+result);
	}
	public static int getResult(int [] array)
	{
		int max_ending_here = 0;
		int max_so_far = 0;
		for(int i=0;i<array.length ;i++)
		{
	        max_ending_here = findMaxVal(0, max_ending_here + array[i]);
	        max_so_far = findMaxVal(max_so_far, max_ending_here);
		}
		return max_so_far;
	}
	
	public static int findMaxVal(int val1, int val2)
	{
		if(val1 >= val2)
			return val1;
		else
			return val2;
	}
}