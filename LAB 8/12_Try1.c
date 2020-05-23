#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x[10];
	int n,i;
	int min,max;
	
	printf("So gia tri cua mang: ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
		{
			printf("Nhap gia tri thu %d: ",i+1);
			scanf("%d",&x[i]);
		}
	min = x[0];
	max = x[0];
	for(i=1;i<n;i++)
	{
		if(x[i]<min)
			min=x[i];
		else
			max=x[i];
	}
	printf("\nGia tri nho nhat la: %d",min);
	printf("\nGia tri lon nhat la: %d",max);
	return 0;
}
