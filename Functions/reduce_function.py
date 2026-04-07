# reduce function
# program to find the sum of all the elements in a list using reduce function
from functools import reduce
numbers = [1,2,3,4,5]
# the reduce function takes two arguments: the first argument is a function that takes two arguments 
# and returns a single value, and the second argument is a list or sequence that we want to reduce.
# the reduce function applies the function cumulatively to the items of the list, from left to right, so as to reduce the list to a single value.
# in this example, we are using a lambda function that takes two arguments x and y and returns their sum. The reduce function applies this lambda function cumulatively to the items of the numbers list, so that it computes the sum of all the elements in the list.
sum_of_numbers = reduce(lambda x,y: x+y, numbers)
print("Sum of all the elements in the list using reduce function and lambda function:")
print(sum_of_numbers)
# How reduce works internally
# It processes step-by-step like this:
# Step 1: 1 + 2 = 3
# Step 2: 3 + 3 = 6
# Step 3: 6 + 4 = 10
# Step 4: 10 + 5 = 15
#  
print(type(sum_of_numbers)) # output: <class 'int'>, the result is an integer because we are adding integers together. If we were to use a different type of data, such as strings, the result would be a string. 

# sum of first 100 numbers using reduce function and lambda function
sum=reduce(lambda x,y: x+y,range(1,101))
print("Sum of first 100 numbers using reduce function and lambda function:")
print(sum) # output: 5050