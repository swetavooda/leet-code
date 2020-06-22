// problem link: 
// Time Complexity O(n)
// Extra space O(n)
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i:nums)
        {
            if(map.get(i)!=null)
            {
                if(map.get(i)==2)
                {
                    map.remove(i);
                }
                else
                {
                    map.replace(i,map.get(i)+1);
                }
            }
            else
            {
                map.put(i,1);
            }
        }
        Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
        return (int)entry.getKey();

        
        
    }
}
// bit manipulation
// TimeComplexity O(n)
// Space complexity O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<32;i++)
        {
            int count =0;
            for(int j=0;j<nums.length;j++)
            {
                if((nums[j]&(1<<i))!=0)
                    count++;
            }
            result=result | ((count%3)<<i);
        }
        return result;
    }
}
