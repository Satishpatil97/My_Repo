'''
Expected output :
when n=5
* * * * *
 * * * *
  * * *
   * *
    *
'''
n=int(input("enter number of rows : "))

for i in range(n):
    print(" "*i + "* " *(n-i))