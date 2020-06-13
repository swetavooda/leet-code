/**
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
**/
problem link: https://leetcode.com/problems/insert-delete-getrandom-o(1)/

class RandomizedSet {

    /** Initialize your data structure here. */
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    int arr[];
    int len;
    public RandomizedSet() {
        len=0;
        arr=new int[100000];
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hmap.get(val)==null)
        {
            hmap.put(val,len);
            arr[len]=val;
            len+=1;
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hmap.get(val)==null) 
            return false;
        else
        {
            int idx=hmap.get(val);
            arr[idx]=arr[len-1];
            hmap.replace(arr[len-1],idx);
            len-=1;
            
            hmap.remove(val);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r=new Random();
        int randomNumber=r.nextInt(len);
        return arr[randomNumber];
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */