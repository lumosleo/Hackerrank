'''

Objective 
In the previous challenge, we calculated a mean. In this challenge, we practice calculating a weighted mean. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an array,X , of N integers and an array, W , representing the respective weights of X's elements, calculate and print the weighted mean of X's elements. Your answer should be rounded to a scale of  decimal place (i.e.,  format).

Input Format

The first line contains an integer,N , denoting the number of elements in arrays X and W . 
The second line contains N space-separated integers describing the respective elements of array . 
The third line contains N space-separated integers describing the respective elements of array .

Constraints
5 <= N <=50
0 <= Xi <= 100, where Xi is the ith element of array X.
0 <= Wi <= 100, where Wi is the ith element of array W.
Output Format

Print the weighted mean on a new line. Your answer should be rounded to a scale of 1  decimal place (i.e.,12.3 format).

Sample Input

5
10 40 30 50 20
1 2 3 4 5
Sample Output

32.0




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

def weighted_mean(numbers_str,weights_str,maxcount):
    numbers_list = str2list(numbers_str,separator)
    weights_list = str2list(weights_str,separator)
    prod_list = [numbers_list[x]*weights_list[x] for x in range(0,maxcount)]
    weight_sum = sum(weights_list)
    prod_sum = sum(prod_list)
    return(float(prod_sum/weight_sum))


maxcount = int(get_input())
numbers = get_input()
weights = get_input()


print(str(weighted_mean(numbers,weights,maxcount)))
