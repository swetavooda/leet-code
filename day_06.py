"""
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
"""

# problem link : https://leetcode.com/problems/queue-reconstruction-by-height/

class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        sorted_list=sorted(people)
        ans=[]
        for i in range(0,len(people)):
            ans.append([])       
        for i in range(0,len(people)):
            insert_smallest=sorted_list.pop(0)
            spaces=insert_smallest[1]
            count_spaces=0
            ind=0
            for i in ans:
                if count_spaces==spaces:
                    while(ind<len(people)):
                        if(ans[ind]==[]):
                            ans[ind]=insert_smallest
                            break
                        ind+=1
                    break
                elif i==[] :
                    count_spaces+=1
                elif i[0]>=insert_smallest[0]:
                    count_spaces+=1
                ind+=1
        return ans
