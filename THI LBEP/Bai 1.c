#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num,sum=0;
	int digit,d;
	
	printf("Enter number: ");
	scanf("%d",&num);
	while(num)
		{
		digit=num%10;
		num=num/10;
		sum = sum+digit;
		}
	printf("Total digits: %d",sum);
	return 0;
}
