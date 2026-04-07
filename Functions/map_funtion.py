# map function 
# Square of a number

numbers= [1,2,3,4,5]

Squareit = list(map(lambda n: n*n ,numbers))
print("Square of numbers using map function and lambda function:")
print(Squareit)

# map() with two lists
l1 = [1,2,3,4,5]
l2=[5,10,15,20,25]
l3= list(map(lambda x,y: x+y ,l1,l2))
print("Sum of two lists using map function and lambda function:")
print(l3)

l4=list(map(lambda x,y,z:x+y+z,l1,l2,l3 ))
print("Sum of three lists using map function and lambda function:")
print(l4)

# map function can also be used with other types of data, such as strings. For example, we can use the map function to convert a list of strings to uppercase:
strings = ["hello", "world", "python"]
uppercase_strings = list(map(lambda s: s.upper(), strings))
print("Uppercase strings using map function and lambda function:")
print(uppercase_strings)
