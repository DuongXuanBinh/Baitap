#include <stdio.h>
#include <stdlib.h>

int main(){
	char c;
	printf("Nhap ky tu: ");
	scanf("%c",&c);
	if(c>='A'&&c<='Z')
		printf("Chu thuong = %c",c +'a'-'A');
	else
		printf("Ki tu vua nhap la = %c",c);
	}
