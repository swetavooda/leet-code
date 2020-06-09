class Solution {
    public static boolean isSubsequence(String s, String t) {
        int n=s.length();
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            int k=t.indexOf(s.charAt(i),pos+1);            
            if(k>pos) 
            {
                pos=k;
            }
            else
                return false;
        }
        return true;
        
    }
}