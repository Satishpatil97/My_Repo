#include<stdio.h>
int main()
{
	int num=47;
	printf("Number is\t%d\n",num);

/*
	16	47	
	16	2	15
	16	0	2


	0 	2	15	or    0  2  F

	16[2]	16[1]	16[0]

	  	32    + 15
*/
	
	printf("Hexadecimal of 47 is\t%x\n",num);
	

/*

	8	47	
	8	5	7
	8	0	5


	0	5	7

	8[2]	8[1]	8[0]

	    	40  + 7

*/
	
	printf("Octal of 47 is\t%o\n",num);

	
}