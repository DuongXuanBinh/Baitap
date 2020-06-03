#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int main(int argc, char *argv[]) {
	char abc;
	int xyz;
	float length;
	double area;
	long liteyrs;
	short arm;

	printf("Nhap gia tri abc: ");
	scanf("%c",&abc);
	printf("Gia tri abc la %c \n",abc);
	
	printf("Nhap gia tri xyz: ");
	scanf("%d",&xyz);
	printf("Gia tri xyz là %d\n",xyz);
	
	printf("Nhap gia tri length: ");
	scanf("%f",&length);
	printf("Gia tri length la %f \n",length);
	
	printf("Nhap gia tri area: ");
	scanf("%lf",&area);
	printf("Gia tri area la %lf \n",area);
	
	printf("Nhap gia tri liteyrs: ");
	scanf("%ld",&liteyrs);
	printf("Gia tri liteyrs la %ld \n",liteyrs);
	
	printf("Nhap gia tri arm: ");
	scanf("%hd",&arm);
	printf("Gia tri cua arm la %hd \n",arm);
	 
	return 0;
}
