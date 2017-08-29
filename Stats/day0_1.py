'''
Objective 
In this challenge, we practice calculating the mean, median, and mode. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an array,X , of N  integers, calculate and print the respective mean, median, and mode on separate lines. If your array contains more than one modal value, choose the numerically smallest one.

Note: Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of 1  decimal place (i.e., 12.3,7.0  format).

Input Format

The first line contains an integer, N , denoting the number of elements in the array. 
The second line contains N space-separated integers describing the array's elements.

Constraints
10 <= N <= 2500
0 < Xi < 10^5 , where Xi is the ith element of the array.
Output Format

Print 3  lines of output in the following order:

Print the mean on a new line, to a scale of  decimal place (i.e.,12.3 ,7.0 ).
Print the median on a new line, to a scale of  decimal place (i.e.,12.3 ,7.0 ).
Print the mode on a new line; if more than one such value exists, print the numerically smallest one.
Sample Input

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
Sample Output

43900.6
44627.5
4978


'''
from collections import Counter
import operator
input_str = ""
separator = " "
def get_input():
    input_str = input()
    return(input_str)

def str2list(input_str,separator):
    input_list = [int(x) for x in input_str.split(separator)]
    return(input_list)

def mean(input_str):
    mylist = str2list(input_str,separator)
    res = sum(mylist)
    length = len(mylist)
    return(float(res)/float(length))

def median(input_str):
    mylist = str2list(input_str,separator)
    sortedlist = sorted(mylist)
    count = len(mylist)
    if count%2 == 0:
        return((sortedlist[int(count/2)] + sortedlist[int(count/2 - 1)])/2)
    else:
        return(sortedlist[int((count-1)/2)])

def mode(input_str):
    mylist = str2list(input_str,separator)
    newdict = {i:mylist.count(i) for i in mylist}
    maxcount = max(newdict.values())
    vals = []
    for k,v in newdict.items():
        if v == maxcount:
            vals.append(k)
    minkey = min(vals)
    return(minkey)


maxcount = get_input()
array = get_input()

print(str(mean(array)))
print(str(median(array)))
print(str(mode(array)))
