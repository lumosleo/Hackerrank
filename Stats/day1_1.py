'''

Objective 
In this challenge, we practice calculating quartiles. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an array,x , of n integers, calculate the respective first quartile (Q1), second quartile (Q2), and third quartile (Q3). It is guaranteed that Q1, Q2, and Q3 are integers.

Input Format

The first line contains an integer, n , denoting the number of elements in the array. 
The second line contains n space-separated integers describing the array's elements.

Constraints
5 <= n <= 50
0 <= Xi <= 100 , where Xi is the ith element of the array.
Output Format

Print  lines of output in the following order:

The first line should be the value of .Q1
The second line should be the value of .Q2
The third line should be the value of .Q3
Sample Input

9
3 7 8 5 12 14 21 13 18
Sample Output

6
12
16



'''

input_str = ""
separator = " "
def get_input():
    input_str = input()
    return(input_str)

def str2list(input_str,separator):
    input_list = [int(x) for x in input_str.split(separator)]
    return(input_list)

def median(input_str,start,end):
    mylist = sorted(str2list(input_str,separator))
    newlist = [mylist[x] for x in range(start,end)]

    l = len(newlist)

    if len(newlist)%2 == 0:
        add = newlist[int(l/2)]+newlist[int(l/2) - 1]
        median = int(add/2)
        print(str(median))
        
    else:
        median = newlist[int((l-1)/2)]
        print(str(median))
    
    
maxcount = int(get_input())
number_str = get_input()
    
    
if maxcount%2 != 0:
    median(number_str,0,int(maxcount/2))
    median(number_str,0,int(maxcount))
    median(number_str,int((maxcount/2 + 1)),int(maxcount))
else:
    median(number_str,0,int(maxcount/2))
    median(number_str,0,int(maxcount))
    median(number_str,int((maxcount/2)),int(maxcount))
    
    
    
