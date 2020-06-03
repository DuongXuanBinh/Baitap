#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float toan,ly,hoa;
	
	printf("Nhap diem toan: ");
	scanf("%f",&toan);
	printf("\nNhap diem ly: ");
	scanf("%f",&ly);
	printf("\nNhap diem hoa: ");
	scanf("%f",&hoa);
	
	printf("Tong diem 3 mon la: %f\n",toan+ly+hoa);
	printf("Diem trung binh la: %f",(toan+ly+hoa)/3);
	
	return 0;
}
