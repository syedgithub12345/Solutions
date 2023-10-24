//A message containing letters from A-Z can be encoded into 
//numbers using the following mapping:

//'A' -> "1"
//'B' -> "2"
//...
//'Z' -> "26"
//To decode an encoded message, all the digits must be grouped 
//then mapped back into letters using the reverse of the mapping above (there may be multiple ways).
//java

public class decodeways {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int onedigit = Integer.parseInt(s.substring(i - 1, i));
            int twodigit = Integer.parseInt(s.substring(i - 2, i));
            if (onedigit >= 1 && onedigit < 10) {
                dp[i] += dp[i - 1];
            }
            if (twodigit >= 10 && twodigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}