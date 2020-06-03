#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int age;
	float salary;
	
	printf("Nhap so tuoi: ");
	scanf("%d",&age);
	printf("Nhap so luong: ");
	scanf("%f",&salary);
	
	printf("Tuoi cua nguoi lao dong la: %d \n",age);
	printf("Luong cua nguoi lao dong la: %f",salary);
	
	return 0;
}
