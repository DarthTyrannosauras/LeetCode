package lc.debug;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//int[] temperatures = {77,77,77,77,77,41,77,41,41,77};
		int[] temperatures = {73,74,75,71,69,72,76,73};
		int[] res = dailyTemperatures(temperatures);
		for(int i = 0; i < res.length; i++){
		    System.out.print(res[i] + " ");
		}
	}
	
	public static int[] dailyTemperatures(int[] temperatures){
	    Stack<Integer> temperatureStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        Stack<Integer> daysStack = new Stack<>();
        int[] days = new int[temperatures.length];
        List<Integer> daysNCList = new ArrayList<>();
        List<Integer> countNCList = new ArrayList<>();

        for(int i = 0; i < temperatures.length; i++){
            while(!temperatureStack.empty()){
                if(temperatureStack.peek() < temperatures[i]){
                    temperatureStack.pop();
                    daysNCList.add(daysStack.pop());
                    int count = countStack.pop();
                    if(!temperatureStack.empty()) {
                    	int countToBeUpdated = countStack.pop();
                        countStack.push(countToBeUpdated + count);
                    }
                    else
                    	countStack.push(1 + count);
                    countNCList.add(count+1);
                }
                else{
                	int count = countStack.pop();
                    countStack.push(count + 1);
                    break;
                }    
            }

            if(i!=(temperatures.length - 1) && temperatures[i] < temperatures[i+1]){
                days[i]=1;
                continue;
            }

            temperatureStack.push(temperatures[i]);
            countStack.push(0);
            daysStack.push(i);
        }
        for(int i = 0; i < daysNCList.size(); i++){
            days[daysNCList.get(i)] = countNCList.get(i);
        }
        days[temperatures.length-1] = 0;
        return days;
	}
}
