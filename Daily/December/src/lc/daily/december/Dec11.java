package lc.daily.december;

import java.util.HashMap;
import java.util.Map;

public class Dec11 {

	public static int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> arrMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(arrMap.containsKey(arr[i]))
                arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
            else
                arrMap.put(arr[i], 1);
        }
        return arrMap.entrySet().stream().filter(e->e.getValue()>(arr.length/4)).mapToInt(e->e.getKey()).findFirst().orElseThrow();
    }
	public static void main(String[] args) {
		int[] numsArr = {1,1};
		System.out.println(findSpecialInteger(numsArr));

	}

}
