class palindrome {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
        int start = 0;
        int end = st.length() - 1;
        while (start < end) {
            if (st.charAt(start) != st.charAt(end)) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome ob = new palindrome();
        int x = 1221;
        boolean result = ob.isPalindrome(x);
        System.out.println(result);
    }
}