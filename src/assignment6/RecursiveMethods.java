package assignment6;

public class RecursiveMethods {

	/**
	 * Recursively computes base ^ exponent
	 * 
	 * @param base the base - can be positive or negative
	 * @param exp  the exponent - can be positive or negative
	 * @return base ^ exponent
	 */
	public static double exponent(int base, int exp) {
		
			if(exp == 0)
			{
				return 1;
			}
			
			if(exp < 0)
			{
				if(base > 0)
				{
					return (1/(double)base)*exponent(base, exp+1);
				}
				else if(base == 0)
				{
				return Double.POSITIVE_INFINITY;
				}
				else
				{
					return -((double)1/(0-base))*exponent(base, exp+1);
				}
			}
			
			if(base == 0 && exp >0)
			{
				return 0;
			}
			
			return base * exponent(base, exp-1);	
			
	}

	

	/**
	 * Recursively compute the sum of elements in an array
	 * 
	 * @param array an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] array) {
			int idx = array.length -1;
			return helper(array, idx);
			
	}
	public static int helper(int[]array, int idx) // {2,5,8,4,3}
	{
		if(idx < 0)
		{
			return 0;
		}
		return array[idx]+ helper(array, idx-1); // 3+4+8+5+
	}

	/**
	 * Recursively computes string representations of dragon curves
	 * 
	 * @param n the desired degree of the dragon curve
	 * @return the nth dragon curve
	 */
	public static String dragon(int n) {
		
			// FIXME Recursively compute dragon curves
			if(n == 0)
			{ 
				return "F-H";
			}

        String prev = dragon(n - 1);
        String step1 = prev.replace("F", "A");
        String step2 = step1.replace("H", "B");
        step2 = step2.replace("A", "F-H");
        return step2.replace("B", "F+H");

        }

			   


	

	/**
	 * Finds the length of the longest path in the given 2D array from the specified
	 * start position.
	 * 
	 * @param chart 2D array of stones
	 * @param r     start position row
	 * @param c     start position column
	 * @return the length of the longest path that was found
	 */
	public static int maxPathLength(boolean[][] chart, int r, int c) {
		
			if (r < 0 || r >= chart.length || c < 0 || c >= chart[0].length || chart[r][c] == false)
			{
				return 0;
			}
			chart[r][c] = false;             
    int max = 0;
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    for (int i = 0; i < 4; i++) {
        max = Math.max(max, maxPathLength(chart, r + dr[i], c + dc[i]));
    }
    chart[r][c] = true;               
    return max + 1;
} 		
	}
