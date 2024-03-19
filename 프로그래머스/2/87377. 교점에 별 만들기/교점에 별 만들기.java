import java.util.*;
class Solution {
     public static String[] solution(int[][] line) {
        String answer = "";
        List<long[]> dots = new ArrayList<>();
        long xMax = Long.MIN_VALUE;
        long xMin = Long.MAX_VALUE;

        long yMax = Long.MIN_VALUE;
        long yMin = Long.MAX_VALUE;

        for(int i=0;i<line.length;i++) {
            for(int j=i+1;j<line.length;j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];

                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                if(a*d - b*c == 0) continue;

                double xValue = (double)(b*f - e*d) / (a*d - b*c);
                double yValue = (double)(e*c - a*f) / (a*d - b*c);

                if (xValue % 1 == 0 && yValue % 1 == 0) {
                    long x = (long)xValue;
                    long y = (long)yValue;
                    if (x > xMax) xMax = x;
                    if (x < xMin) xMin = x;

                    if (y > yMax) yMax = y;
                    if (y < yMin) yMin = y;

                    dots.add(new long[]{x, y});
                }
            }
        }

        return getStarStrArray(xMin, xMax, yMin, yMax, dots);
    }

    public static String[] getStarStrArray(long xMin, long xMax, long yMin, long yMax, List<long[]> dots) {
        char[][] result = new char[(int) (yMax - yMin + 1)][(int) (xMax - xMin + 1)];
        List<String> starsList = new ArrayList<>();

        for(char[] chars: result) {
            Arrays.fill(chars, '.');
        }

        for(long[] point: dots) {
            result[(int) (yMax - point[1])][(int) (point[0] - xMin)] = '*';
        }

        String[] answer = new String[result.length];
        for(int i=0;i<result.length;i++) {
            answer[i] = new String(result[i]);
        }

        return answer;
    }
        
}