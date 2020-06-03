#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int k,i,n=0;
	char x[10][10];
	char y[10];

	do
	{
		printf("Nhap ten nguoi thu %d: ",n+1);
		scanf("%s",x[n]);
	}while(strcmp(x[n++],"END"));
	
	n=n-1;
	
	for(i=0;i<n-1;++i)
		{
			for(k=i+1;k<n;++k)
			{
				if(strcmp(x[i],x[k])>0)
				{
					strcpy(y[10],x[i]);
					strcpy(x[i],x[k]);
					strcpy(x[k],y[10]);
				}
			}
		}
	printf("Thu tu theo bang chua cai la: \n");
	for(k=0;k<n;++k)
	{
		printf("Thu %d la %s\n",k+1,x[k]);
	}
	
	return 0;
}
