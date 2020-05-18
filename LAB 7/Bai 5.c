#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int mathe,mapin,sodu=10000000,sotien;
	char ans;
	printf("Nhap ma the: ");
	scanf("%d",&mathe);
	printf("\nNhap ma pin: ");
	scanf("%d",&mapin);
	
	if(mathe==123&&mapin==124)
	{
		printf("So du hien tai la %d",sodu);
		do{
			printf("\nNhap so tien: ");
			scanf("%d",&sotien);
			if(sotien>=0&&sotien<=sodu)
				{
				sodu-=sotien;
				printf("\nSo du con lai la %d",sodu);
				}
			else
				printf("\nSo tien qua lon");
			printf("\nTiep tuc giao dich? (y/n): ");
			fflush(stdin);
			ans=getchar();	
		}while(ans=='y');
			printf("Cam on!");
	}	
	else
		printf("Sai ma the hoac mat khau");
	return 0;
}
