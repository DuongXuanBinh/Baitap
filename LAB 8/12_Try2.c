#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char x[10];
	int i,nguyenam=0,phuam=0;
	
	printf("Nhap chuoi ki tu: ");
	scanf("%s",x);

	for(i=0;i<10;i++)
	{
		switch(x[i])
			{
			case'a':
			case'i':
			case'u':
			case'o':
			case'e':
				nguyenam+=1;
				break;
			}
	}
	printf("\nSo nguyen am la: %d",nguyenam);
	printf("\nSo phu am la: %d", phuam=strlen(x)-nguyenam);
	return 0;
}
