#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int diem;
	
	printf("Nhap so diem: ");
	scanf("%d",&diem);
	
	if(diem>=75)
		printf("Loai A");
	else if(diem>=60&&diem<75)
		printf("Loai B");
	else if(diem>=45&&diem<60)
		printf("Loai C");
	else if(diem>=35&&diem<45)
		printf("Loai D");
	else if(diem<35)
		printf("Loai E");
	return 0;
}
