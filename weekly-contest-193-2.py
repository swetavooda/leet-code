"""Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements."""

# Least Number of Unique Integers after K Removals


class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        dict_count={}

        for i in arr:
            if(i in dict_count):
                dict_count[i]+=1
            else:
                dict_count[i]=1
        sort_dict = sorted(dict_count.items(), key=lambda x: x[1], reverse=False)

        for i in sort_dict:
            #print(i)
            if(k-i[1]>=0):
                k-=i[1]
                dict_count.pop(i[0])
            elif(k<=0):
                break
        return len(dict_count)
                
            