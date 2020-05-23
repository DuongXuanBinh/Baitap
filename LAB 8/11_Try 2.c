#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,j,k=0;
	char x[10];
	
	printf("Nhap text: ");
	scanf("%s",x);
	i = strlen(x);
	for(j=0;j<10;j++)
		switch(x[j])
			{
			case'a':
			case'i':
			case'u':
			case'e':
			case'o':
				k += 1;
				break;
			}
	printf("\nSo nguyen am la: %d",k);
	printf("\nSo phu am la: %d",i-k);
	return 0;
}
