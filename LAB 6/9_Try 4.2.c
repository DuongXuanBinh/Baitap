#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,k;
	
	for(i=5;i>0;i--)
	{
		printf("\n");
		for(k=1;k<=i;k++)
			printf("%d ",k);
	}
	
	return 0;
}
