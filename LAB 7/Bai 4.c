#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char ans;
	int nuoccam,caphe,nuocchanh,i,sum;
	
	nuoccam = 30000;
	caphe = 35000;
	nuocchanh = 25000;
	sum=0;
	printf("Nuoc cam = 30000VND\n");
	printf("Ca phe = 30000VND\n");
	printf("Nuoc chanh = 25000VND\n");
	do{
		printf("Nhap loai do uong(1=nuoccam, 2=caphe, 3=nuocchanh): ");
		scanf("%d",&i);
		if(i==1)
			{
			printf("Thanh tien: %d\n",nuoccam);
			sum+=nuoccam;
			}
		else if(i==2)
			{
			printf("Thanh tien: %d\n",caphe);
			sum+=caphe;
			}
		else if(i==3)
			{
			printf("Thanh tien: %d\n",nuocchanh);
			sum+=nuocchanh;
			}
		printf("Order tiep?(y/n): ");
		fflush(stdin);
		ans = getchar();

	}while(ans=='y');
	printf("Tong tien la %d",sum);
		
	return 0;
}
