#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int asmt,lythuyet,thuchanh;
	
	printf("Nhap diem asmt: ");
	scanf("%d",&asmt);
	printf("\nNhap diem ly thuyet: ");
	scanf("%d",&lythuyet);
	printf("\nNhap diem thuc hanh: ");
	scanf("%d",&thuchanh);
	
	if(0<=asmt&&asmt<=10)
		{
			if(asmt>=4)
				printf("\nAsmt: Passed");
			else
				printf("\nAsmt: Not passed");
		}
	else
		printf("\nAsmt: invalid");
	
	if(0<=lythuyet&&lythuyet<=100)
		{
			if(lythuyet>=40)
				printf("\nLy thuyet: Passed");
			else
				printf("\nLy thuyet: Not passed");
		}
	else
		printf("\nLy thuyet: Invalid");
	if(0<=thuchanh&&thuchanh<=15)
		{
			if(thuchanh>=6)
				printf("\nThuc thanh: Passed");
			else
				printf("\nThuc hanh: Not passed");
		}
	else
		printf("Thuc hanh: Invalid");
	return 0;
}
