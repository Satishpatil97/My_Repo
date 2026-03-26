n=int(input("enter number of rows: "))

for i in range(n):
    print((" "*(n-i-1)) + "* "*(i+1))
for j in range(n-1):
    print(" " * (j+1)+ "* "*(n-j-1))


# print(100/0)   ZeroDivisionError: division by zero
