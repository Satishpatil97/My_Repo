'''
Expected output :
when n=5

*
* *
* * *
* * * *
* * * * *

'''
n=int(input('enter number of rows: '))

for i in range(n):
    print("* " *(i+1))

#alternate way
print()
print("Alternate way")
print()

for i in range(n): # 0,1,2,3,4
    for j in range(i+1):  # i=0 , i=1
        print("*", end=" ")  # print * one time at first  , when i =1 -- * * second time
    print() # for new line