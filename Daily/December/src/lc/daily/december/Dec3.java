package lc.daily.december;

/* 1266. Minimum Time Visiting All Points
 * On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi]. 
 * Return the minimum time in seconds to visit all the points in the order given by points.
 * 
 * You can move according to these rules:
 * In 1 second, you can either:
 * move vertically by one unit,
 * move horizontally by one unit, or
 * move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
 *
 * You have to visit the points in the same order as they appear in the array.
 * You are allowed to pass through points that appear later in the order, but these do not count as visits.
 * */

public class Dec3 {
	public static int minTimeToVisitAllPoints(int[][] points) {
		int length = 0;
		for (int i = 0; i < points.length - 1; i++) {
			length += Math.max(Math.abs(points[i][0] - points[i+1][0]), 
					Math.abs(points[i][1] - points[i+1][1])); 
			System.out.println("Time for visit betn [" + points[i][0] +"," + points[i][1] +"] and ["
					+ points[i+1][0] +"," + points[i+1][1] +"]");
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{1,1},{3,4},{-1,0}};
		int minTime = minTimeToVisitAllPoints(points);
		System.out.println("Min time: " + minTime);
	}

}
