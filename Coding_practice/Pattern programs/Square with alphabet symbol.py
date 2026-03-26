'''
expected output :
when n=5 :
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
'''

n=int(input("enter number of rows: "))

for i in range(n): #n=5 :   0,1,2,3,4
    print((chr(i+65)+' ')*n )  # chr to convert number into ascii

