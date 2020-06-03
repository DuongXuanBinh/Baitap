#include <stdio.h>
#include <stdlib.h>

void main(){
	int i,j,temp,arr_num[5] = {23,90,9,25,16};

	for(i=3;i>=0;i--)
		for(j=4;i>=4-i;j--)
		{
			if(arr_num[j]<arr_num[j-1])
			{
				temp = arr_num[j];
				arr_num[j]=arr_num[j-1];
				arr_num[j-1]=temp;
			}
		}
	printf("\nThe sorted array");
	for(i=0;i<5;i++)
		printf("\n%d",arr_num[i]);

}
