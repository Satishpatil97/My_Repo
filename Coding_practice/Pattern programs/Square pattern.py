
'''
Expected output:
n=5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

'''
n=int(input('enter number of rows: '))

for i in range(n):
    print('* ' *n) #print n times each row
