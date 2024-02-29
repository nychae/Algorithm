import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        int[] fac = {balls, (balls-share), share};
        BigInteger[] result = {BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1)};

        for(int i=0;i<fac.length;i++) {
            int num = fac[i];

            while(num > 0) {
                result[i] = result[i].multiply(BigInteger.valueOf(num));
                num--;
            }
        }


        return  result[0].divide(result[1].multiply(result[2])).intValue();

    }
}