"""
There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.

Now given all the cities and flights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
"""
# problem link: https://leetcode.com/problems/cheapest-flights-within-k-shops/

# dfs with weighted nodes
class Solution:
    def findCheapestPrice(self,n,flights,src,dst,k):
        l=[]
        path_dict={}
        for i in range(0,n):
            path_dict[i]=[]
        for i in flights:
            path_dict[i[0]].append([i[1],i[2]])
        l=[[src,0,-1]]
        min_dist=1000000000000000000
        while(l!=[]):
            p=l.pop(0)
            if p[0]==dst:
                if p[1]<min_dist:
                    min_dist=p[1]
            for i in path_dict[p[0]]:
                if(p[2]+1<=k and p[1]+i[1]<=min_dist):
                    l.append([i[0],p[1]+i[1],p[2]+1])
        if(min_dist==1000000000000000000):
            return -1
        else:
            return min_dist