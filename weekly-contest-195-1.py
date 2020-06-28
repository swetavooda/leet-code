# problem link :https://leetcode.com/contest/weekly-contest-195/problems/path-crossing/
class Solution(object):
    def isPathCrossing(self, path):
        """
        :type path: str
        :rtype: bool
        """
        current=[0,0]
        visited=[]
        for i in path:
            visited.append(current[0:])
            if(i=='N'):
                current[1]=current[1]+1
            elif i=='S':
                current[1]=current[1]-1
            elif i=='W':
                current[0]=current[0]-1
            else:
                current[0]=current[0]+1
            if(current in visited):
                return True
        return False