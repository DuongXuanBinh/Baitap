#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int sotuoi,i;
	char ten[50];

	printf("Nhap ten: ");
	scanf("%s",&ten);
	printf("Nhap so tuoi: ");
	scanf("%d",&sotuoi);
	
	for(i=1;i<=sotuoi;i++)
		printf("%s\n",ten);
	return 0;
}
