'''
Expected output
n=5:
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
'''

n=int (input ('enter number of rows: '))

for i in range(n):  #n=5 -- 0,1,2,3,4
    print((str(i+1)+' ')*n) # n=5 :  str((0+1)+' ')*5 = 1 1 1 1 1 -- first row