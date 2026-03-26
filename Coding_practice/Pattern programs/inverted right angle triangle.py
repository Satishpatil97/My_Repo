'''
Expected output :
n=5
* * * * *
* * * *
* * *
* *
*

'''

n=int(input("enter number of rows : "))

for i in range (n): #0,1,2,3,4
    print("* " * (n-i))

print()
print("alternate way")
print()

for i in range(n):
    for j in range(n-i): #n=5 j=0
        print("* ", end= " ") # 5-0 * * * * *
    print()