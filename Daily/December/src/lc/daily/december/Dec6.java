package lc.daily.december;

/* 1716. Calculate Money in Leetcode Bank
 * 
 * Hercy wants to save money for his first car. 
 * He puts money in the Leetcode bank every day.
 * 
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. 
 * On every subsequent Monday, he will put in $1 more than the previous Monday.
 * 
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 * */

public class Dec6 {
	public static int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        // AP for weeks, and 1$/day/week extra for summation(1->day)
        if(n<=7)
            return days*(days+1)/2;
        return weeks*28 + weeks*(weeks-1)*7/2 + days*(days+1)/2 + weeks*days;
    }
	
	public static void main(String[] args) {
		System.out.println(totalMoney(15));
	}
}
