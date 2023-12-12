package lc.arrayAndHashing.core;

import java.util.HashMap;
import java.util.Map;

public interface ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {
        Map<Character,Integer> checkMap = new HashMap<>();
        //Checking all Rows:
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(checkMap.containsKey((Character)board[i][j]))
                        return false;
                    else
                        checkMap.put(board[i][j], 1);
                }
            }
            checkMap.clear();
        }

        //Checking all Columns
        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){
                if(board[i][j] != '.'){
                    if(checkMap.containsKey(board[i][j]))
                        return false;
                    else{
                        checkMap.put(board[i][j], 1);
                    }
                }
            }
            checkMap.clear();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                for(int k = 3 * i; k < (i + 1) * 3; k++){
                    for(int l = 3 * j; l < (j + 1) * 3; l++){
                        if(board[k][l] != '.'){
                            if(checkMap.containsKey(board[k][l])){
                                return false;
                            }
                                
                            else{
                                checkMap.put(board[k][l], 1);
                            }
                        }
                    }
                }
                checkMap.clear();
            }
        }
        return true;
    }

}
