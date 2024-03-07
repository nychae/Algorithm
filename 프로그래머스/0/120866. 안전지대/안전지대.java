import java.util.*;
class Solution {
    public int solution(int[][] board) {
    int answer = 0;
        List<int[]> mineList = new ArrayList<>();
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j] == 1) {
                    mineList.add(new int[]{i, j});
                }
            }
        }

        mineList.stream().forEach(mine -> {
            for(int i=mine[0]-1;i<=mine[0]+1;i++) {
                if(i == -1 ) continue;
                for(int j=mine[1]-1;j<=mine[1]+1;j++) {
                    if(j == -1) continue;
                    if(i < board.length && j < board[0].length) {
                        board[i][j] = 1;
                    }
                }
            }
        });
        
        return (int) Arrays.stream(board).flatMapToInt(s -> Arrays.stream(s)).filter(value -> value == 0).count();
    }
}