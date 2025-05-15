#include<stdio.h>
int main()
{
	int num=35;
	printf("Number is\t%d\n",num);
	
/*

	16	35	
	16	2	3
	16	0	2


	0 	2	3

	16[2]	16[1]	16[0]

	  	32    +	3

*/
	printf("Hexadecimal is\t%x\n",num);
	

/*
	8	35	
	8	4	3
	8	0	4


	0	4	3

	8[2]	8[1]	8[0]

	    32  +	3
*/

	printf("Octal is\t%o\n",num);
	
}