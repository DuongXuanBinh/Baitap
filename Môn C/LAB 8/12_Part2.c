#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x[10],y[10];
	int n,i,t;
	
	printf("So gia tri cua mang: ");
	scanf("%d",&n);
	fflush(stdin);
	for(i=0;i<n;i++)
		{
			printf("Nhap gia tri thu %d: ",i+1);
			scanf("%d",&x[i]);
		}
	for(i=0,t=n-1;i<n;i++,t--)
	{
		y[t]=x[i];
	}
	for(t=0;t<n;t++)
		printf("%d\n",y[t]);
	return 0;
}
