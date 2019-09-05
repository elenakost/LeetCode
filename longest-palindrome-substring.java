class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String str = "";
        for (int i = 0; i < s.length(); i++){
            String str1 = checkodd(s, i);
            String str2 = checkeven(s, i, i+1);
            if (str1.length() > str.length()) str = str1;
            if (str2.length() > str.length()) str = str2;
        }
        return str;
    }
    public String checkodd(String s, int middle){
        String pali= String.valueOf(s.charAt(middle)); 
        int left = middle - 1;
        int right = middle + 1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            pali = String.valueOf(s.charAt(left)) + pali +  String.valueOf(s.charAt(right));
            left--;
            right++;
        }
        return pali;
        
    }
    
    public String checkeven(String s, int left, int right){
        String pali="";       
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            pali = String.valueOf(s.charAt(left)) + pali +  String.valueOf(s.charAt(right));
            left--;
            right++;
        }
        return pali;
    }
}
