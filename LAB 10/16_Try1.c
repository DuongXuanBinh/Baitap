#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
float dientich(float x);
float chuvi(float x);
float main() {
	float x;
	printf("Nhap ban kinh cua hinh tron: ");
	scanf("%f",&x);
	chuvi(x);
	dientich(x);
	printf("Chu vi hinh tron la: %f",chuvi(x));
	printf("\nDien tich hinh tron la: %f",dientich(x));
}
float chuvi(float x){
	float chuvi;
	chuvi = x * 3.14;
	return(chuvi);
}
float dientich(float x){
	float dientich;
	dientich = x * x * 3.14;
	return(dientich);
}
	
