#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int m1,m2,m3;
	float per;
	
	printf("Nhap diem m1: ");
	scanf("%d",&m1);
	printf("Nhap diem m2: ");
	scanf("%d",&m2);
	printf("Nhap diem m3: ");
	scanf("%d",&m3);
	
	per= (m1+m2+m3)/3;
	
	if(per>=90)
		printf("Loai E+");
	else if(per>=80&&per<90)
		printf("Loai E");
	else if(per>=70&&per<80)
		printf("Loai A+");
	else if(per>=60&&per<70)
		printf("Loai A");
	else if(per>=50&&per<60)
		printf("Loai B+");
	else
		printf("Truot!");

	return 0;
}
