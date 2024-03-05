class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int[] size = {board[0]/2, board[1]/2};
        for(String direction: keyinput) {
            if(direction.equals("up")) {
                answer[1]++;
                if(answer[1] > size[1]) answer[1] = size[1];
            } else if(direction.equals("down")) {
                answer[1]--;
                if(answer[1] < -size[1]) answer[1] = -size[1];
            } else if(direction.equals("right")) {
                answer[0]++;
                if(answer[0] > size[0]) answer[0] = size[0];
            } else if(direction.equals("left")) {
                answer[0]--;
                if(answer[0] < -size[0]) answer[0] = -size[0];
            }
        }


        return answer;
    }
}