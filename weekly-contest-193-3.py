'''
Given an integer array bloomDay, an integer m and an integer k.

We need to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
'''
# Minimum Number of Days to Make m Bouquets

class Solution:
    def findSets(self,b,m,k):
        if(len(b)<m*k):
            return False
        s=0
        c=0
        count=0
        for i in range(0,len(b)):
            if b[i]==1:
                c+=1
            if b[i]==0:
                c=0
            if c==k:
                c=0
                count+=1
            if(count==m):
                return True
        return False
            
                
        
    def minDays(self, bloomDay,m,k):
        if(len(bloomDay)<m*k):
            return -1
        sorted_bloom=sorted(bloomDay)
        start=sorted_bloom[0]
        days=0
        bloom=[0]*len(bloomDay)
        for day in sorted_bloom:
            days=day
            for i in range(0,len(bloomDay)):
                if bloom[i]==0 and bloomDay[i]<=days:
                    bloom[i]=1
                if self.findSets(bloom,m,k):
                    return days
        return -1