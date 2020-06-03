#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num1,num2,sum;
	sum=0;
	printf("Nhap num1: ");
	scanf("%d",&num1);
	printf("Nhap num2: ");
	scanf("%d",&num2);
	
	for(num1=num1+1;num1<num2;num1++)
		{
		if(num1%2==0) continue;
		sum+=num1;		
		}	
	if(sum!=0)
		printf("Tong cac so le la %d",sum);
	else
		printf("Khong co so le");	
	return 0;
}
