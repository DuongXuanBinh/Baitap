#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num,res;
	printf("Nhap so: ");
	scanf("%d",&num);
	res = num % 2;
	if(res == 0)
		printf("La so chan");
	else
		printf("La so le");
	return 0;
}
