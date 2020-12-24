package matrixUniquePaths;

public class UniquePaths
{
	public static void main(String[] args)
	{
		final int NUMOFROWS = 3;
		final int NUMOFCOLS = 4;
		int numOfPaths = findUniquePaths(NUMOFROWS, NUMOFCOLS);
		System.out.println("the number of unique paths is: " + numOfPaths);
	}

	
	// using dynamic programming memoization
	public static int findUniquePaths(int m, int n)
	{
		int [][] pathValue = new int[m][n];
		
		for(int row = 0; row < m; ++row)
		{
			for(int col = 0; col < n; ++col)
			{
				if(row == 0 || col == 0) // assign 1 to any cell in the row 0 or col 0.
					pathValue[row][col] = 1;
				else
					pathValue[row][col] = pathValue[row-1][col] + pathValue[row][col-1];
				
			}
		}
		
		return pathValue[m-1][n-1];
	}
}