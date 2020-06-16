// problem link: https://leetcode.com/problems/validate-ip-address/

class Solution {
    public  int countMatches(String str,char m)
    {
        int count=0;
        for (char ch: str.toCharArray()) 
        {
            if(ch==m){
                count++;
            }   
        }
        return count;
    }
        public  String validIPAddress(String IP) {
        
        if (countMatches(IP, '.')==3)
        {
            String arr[] = IP.split("\\.");
            if(arr.length==4){
            for (String i:arr)
            {
                if(i.equals(""))
                    return "Neither";
                
                if((i.charAt(0)=='0'||i.charAt(0)=='-') && (i.length()!=1))
                {
                    return "Neither";
                }
                try{
                int n=Integer.valueOf(i);
                System.out.println(i+n);
                if (!(n>=0 && n<=255))
                {
                    
                    return "Neither";
                }
                }
                catch(NumberFormatException e){
                    return "Neither";
                }
                
            }
            return "IPv4";
            }
            else
                return "Neither";
        }        
        else if (countMatches(IP, ':')==7)
        {
            
            String arr[] = IP.split(":");
            String pattern1 = "^[0-9A-Fa-f]+$";
            if(arr.length==8)
            {
            for (String i:arr)
            {
                System.out.println("*"+i+"*");
                if(i.length()>4)
                    return "Neither";
                if(i.equals(""))
                    return "Neither";
                if (!(i.matches(pattern1)))
                {
                    return "Neither";
                }
                
            }
            return "IPv6";
        }
        else
        {
            return "Neither";
        }
            
        
    }
        else
            return "Neither";
    }
}