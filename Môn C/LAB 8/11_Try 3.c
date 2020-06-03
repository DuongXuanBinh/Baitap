#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a[100];
	int n,i,j,k;
	int b;
	
	printf("So gia tri nhap vao: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Nhap gia tri thu %d: ",i+1);
		scanf("%d",&a[i]);
	}
	for(j=0;j<n;j++)		
		for(k=j+1;k<n;k++)
			{
			b=a[j];
			a[j]=a[k];
			a[k]=b;
			}
	for(k=0;k<n;k++)
		printf("\n%d",a[k]);
	return 0;
}
