package lc.arrayAndHashing.core;

import java.util.ArrayList;
import java.util.List;

public interface EncodeAndDecodeString {
	public static String encode(List<String> strs) {
        // write your code here
        String res = "";
        for(String s : strs){
            res = res + s +"#!";
        }
        return res;
    }

    
    public static List<String> decode(String str) {
        // write your code here
        List<String> strList = new ArrayList<String>();
        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='!')
                continue;
            if(str.charAt(i)=='#'){
                strList.add(s);
                s="";
                continue;
            }
            s=s+str.charAt(i);
        }
        return strList;
    }
}
