#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b;
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("Nhap b: ");
	scanf("%d",&b);
	
	if(a-b==a)
		printf("Hieu 2 so bang %d",a);
	else if(a-b==b)
		printf("Hieu 2 so bang %d",b);
	else
		printf("Hieu 2 so khong bang ca a va b");
	return 0;
}
