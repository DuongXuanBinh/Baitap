#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main(){
	int temp[5][5];
	int i,j,high,low;
	int cao(int cao[5][5]);
	int thap(int thap[5][5]);
	
	for(i=0;i<5;i++)
		{
		printf("\nNhiet do thanh pho thu %d la:",i+1);
		for (j=0;j<5;j++)
			{
			printf("\nNhiet do nam thu %d la: ",j+1);
			scanf("%d",&temp[i][j]);
			}
		high = cao(temp);
		printf("\nNhiet do cao nhat cua thanh pho thu %d la: %d",i+1,high);
		low = thap(temp);
		printf("\nNhiet do thap nhat cua thanh pho thu %d la: %d",i+1,low);
		}

}
int cao(int cao[5][5])
{
	int i,j,high = 0;	
	for(i=0;i<5;i++)
		{
			high = cao[i][0];
			for(j=0;j<5;j++)
				{
				if(cao[i][j]>high)
					high = cao [i][j];
					printf("%d", high);
				}
		}
	return (high);
}

int thap(int thap[5][5])
{
	int i,j,low = 0;	
	for(i=0;i<5;i++)
		{
			low = thap[i][0];
			for(j=0;j<5;j++)
				{
				if(thap[i][j]<low)
					low = thap [i][j];
				}
		}
	return (low);
}
