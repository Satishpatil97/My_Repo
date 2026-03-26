'''
Expected output :
when n =5
    *
   * *
  * * *
 * * * *
* * * * *
'''

n=int(input("enter number of rows: "))

for i in range(n):# 0,1,2,3,4
    print(" "*(n-i-1) + "* "*(i+1))
