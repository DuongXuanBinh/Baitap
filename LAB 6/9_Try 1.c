#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num;
	for(num=100;num>0 && num<=100;num-=5)
	{	printf("%d, ",num);
	}
	return 0;
}
