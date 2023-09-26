//Given a string s consisting of words and spaces, 
//return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

class lengthlast {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        int lastIndex = s.length() - 1;

        for (int i = lastIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }

        return length;
    }
}
