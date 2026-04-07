# Explain lambda functions in Python and provide an example of how to use them.
# Lambda functions in Python are anonymous functions that are defined using the `lambda` keyword. They can take any number of arguments but can only have one expression. The expression is evaluated and returned when the function is called. Lambda functions are often used for short, simple functions that are not reused elsewhere in the code.
# Using a lambda function to add two numbers


add = lambda x,y: x+y
print(add(12,23))  # Output: 35

bigger = lambda x,y: x if x>y else y
print(bigger(12,33))  # Output: 33

small = lambda a,b: a if a<b else b
print(small(12,33))  # Output: 12