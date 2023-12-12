package bs.searchInArray;

public class NegativeNosInSortedMatrix {
	
	public static int countNegatives(int[][] grid) {
        int arrSize = grid[0].length - 1;
        int negativeCount = 0;
        for(int i = 0; i < grid.length; i++){
            int low = 0;
            int high = arrSize;
            while(low <= high){
                if(low==high && grid[i][low]<0){
                	//System.out.println("First negative number for row " + i + " is " + grid[i][low]);
                    break;
                }
                int mid = low + (high - low) / 2;
                //System.out.println("Currently in row " + i + "at element " + grid[i][mid]);
                if(grid[i][mid] >= 0){
                    low = mid + 1;
                }
                else
                high = mid - 1;
            }
            
            negativeCount += arrSize - low + 1;
            //System.out.println("negative count for row " + i + " is " + (arrSize - low + 1));
            //System.out.println();
        }
        return negativeCount;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] grid1 = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		//int[][] grid2 = {{3,2},{1,0}};
		//System.out.println(countNegatives(grid1));
		//System.out.println(countNegatives(grid2));
		int[][] grid = {{14, 12, 5, 1, -2, -4, -6, -16}};
		System.out.println(countNegatives(grid));
	}

}
