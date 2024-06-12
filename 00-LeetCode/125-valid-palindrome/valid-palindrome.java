class Solution {

    public boolean check(int n,int i,String s){
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return check(n,i+1,s);
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int n = s.length(),i=0;
        return check(n,i,s);
    }
}