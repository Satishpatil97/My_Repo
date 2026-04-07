# without filter function 
# finding the even numbers in a list
numbers = [1,2,3,4,5,6,7,8,9,10]
def is_even(num):
    if num%2==0:
        return True
    else :
        return False

even_number=[]

for num in numbers:
    if is_even(num) == True :
        even_number.append(num)
    else:
        continue
print("Even numbers without using filter function:")
print(even_number)


# with filter function
numbers = [1,2,3,4,5,6,7,8,9,10]

def is_EVEN(num):
    if num%2==0:
        return True
    else :
        return False

# every element in the numbers list is passed to the is_EVEN function and if the function returns True, 
# then the element is included in the EVEN_NUMBERS list
# the filter function takes two arguments: the first argument is the function that we want to apply to 
# each element in the list, and the second argument is the list or sequence that we want to filter.
# the filter function applies the function to each element in the list and returns an iterator that contains only the elements for which the function returns True.
# the filter function returns an iterator, so we need to convert it to a list using the list() function


EVEN_NUMBERS= list(filter(is_EVEN,numbers))
print("Even numbers using filter function:")
print(EVEN_NUMBERS)

# filter with lambda and filter function
numbers = [1,2,3,4,5,6,7,8,9,10]

EVEN_NUMBERS_LAMBDA = list(filter(lambda n: True if n%2==0 else False, numbers))
print("Even numbers using lambda and filter function:")
print(EVEN_NUMBERS_LAMBDA)

# alternatively, we can also write the lambda function in a more concise way as follows:
EVEN_NUMBERS_LAMBDA2 = list(filter(lambda n: n%2==0, numbers)) 
print("Even numbers using concise lambda and filter function:") 
print(EVEN_NUMBERS_LAMBDA2)

# numbers which is divisible by 3 and odd numbers using filter function and lambda function

Numbers_division_by3_odd= list ( filter(lambda n: n%3==0 and n%2!=0, numbers))
print("Numbers which is divisible by 3 and odd numbers using filter function and lambda function:")
print(Numbers_division_by3_odd) #output: [3, 9]

# the filter function can also be used with other types of data, such as strings. For example, we can use the filter function to find all the words in a list that start with a certain letter:
words = ["apple", "banana", "cherry", "date", "elderberry", "fig", "grape"]
words_starting_with_a = list(filter(lambda word: word.startswith("a"), words))
print("Words starting with 'a':")
print(words_starting_with_a)

# alternate
words_starting_with_a2 = list(filter(lambda word: word[0]=="a", words))
print("Words starting with 'a' (alternate method):")
print(words_starting_with_a2)   
