#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c,sum;
	printf("\n Enter any three number:");
	scanf("%d %d %d", &a, &b, &c);
	sum = a + b + c;
	printf("\n Sum = %d",sum);
	return 0;
}
