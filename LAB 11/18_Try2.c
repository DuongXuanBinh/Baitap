#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	int temp[5][5];
	int i,j,high;
	int min(int temp[5][5]);
	for(i=0;i<5;i++)
		{
		printf("\nNhiet do thanh pho thu %d la:",i+1);
		for (j=0;j<5;j++)
			{
			printf("\nNhiet do nam thu %d la: ",j+1);
			scanf("%d",&temp[i][j]);
			}
		high = max(temp[i][j]);
		printf("Nhiet do cao nhat cua thanh pho thu %d la: %d",i+1,high);
		}

int min(int temp[][5])
{
	int i,j;	
	for(i=0;i<5;i++)
		{
			printf("\nNhiet do lon nhat cua thanh pho %d la ",i+1);
			high = temp[i][0];
			for(j=0;j<5;j++)
				{
				if(temp[i][j]>high)
					high = temp [i][j];
				}
			return (high);
		}
}
