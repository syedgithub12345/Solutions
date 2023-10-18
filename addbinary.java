//Given two binary strings a and b, 
//return their sum as a binary string.
//java

class addbinary {
    public String addBinary(String a, String b) {
        int aDecimal = Integer.parseInt(a, 2);
        int bDecimal = Integer.parseInt(b, 2);
        int sum = aDecimal + bDecimal;
        return Integer.toBinaryString(sum);
    }
}
