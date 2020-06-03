#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,k;
	for(i=7;i>0;i--)
	{
		printf("\n");
		for(k=0;k<i;k++)
			printf("*");
	}
	return 0;
}
