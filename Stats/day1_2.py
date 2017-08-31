'''

Objective 
In this challenge, we practice calculating the interquartile range. We recommend you complete the Quartiles challenge before attempting this problem.

Task 
The interquartile range of an array is the difference between its first () and third () quartiles (i.e., ).

Given an array, , of  integers and an array, , representing the respective frequencies of 's elements, construct a data set, , where each  occurs at frequency . Then calculate and print 's interquartile range, rounded to a scale of  decimal place (i.e.,  format).

Tip: Be careful to not use integer division when averaging the middle two elements for a data set with an even number of elements, and be sure to not include the median in your upper and lower data sets.

Input Format

The first line contains an integer, , denoting the number of elements in arrays  and . 
The second line contains  space-separated integers describing the respective elements of array . 
The third line contains  space-separated integers describing the respective elements of array .

Constraints

, where  is the  element of array .
, where  is the  element of array .
The number of elements in  is equal to .
Output Format

Print the interquartile range for the expanded data set on a new line. Round your answer to a scale of  decimal place (i.e.,  format).

Sample Input

6
6 12 8 10 20 16
5 4 3 2 1 5
Sample Output

9.0



'''

separator = " "

odd = -1
lo = -1
mid = -1
hi = -1

def str2list(input_str,separator):
    output_list = [int(x) for x in input_str.split(separator)]
    return output_list

def list2str(input_list,separator):
    output_str = separator.join(map(str,input_list))
    return(output_str)

def median(input_list,start,end):
    new_list = [input_list[x] for x in range(start,end)]
    length = len(new_list)
    if length%2 == 0:
        odd = 0
        sum = new_list[int(length/2)] + new_list[int(length/2 - 1 )]
        res = sum/2
    else:
        odd = 1
        res = new_list[int((length-1)/2)]/2*2
        #*2/2 ensures the end result is in a float format 
        
    return(res)

def freq2setlist(input_list,weights_list):
    set_list = []
    for x in range(0,len(input_list)):
        for i in range(0,weights_list[x]):
            set_list.append(input_list[x])
    return(sorted(set_list))

length = int(input())
input_str = input()
weights_str = input()

input_list = str2list(input_str,separator)
weights_list = str2list(weights_str,separator)
set_list = freq2setlist(input_list,weights_list)
maxlength = len(set_list)

if maxlength%2 == 0:
    lo = median(set_list,0,int(maxlength/2))
    mid = median(set_list,0,int(maxlength))
    hi = median(set_list,int(maxlength/2),maxlength)
else:
    lo = median(set_list,0,int(maxlength/2 - 1))
    mid = median(set_list,0,int(maxlength))
    hi = median(set_list,int(maxlength/2 + 1),int(maxlength))
    
print(str(hi-lo))  
