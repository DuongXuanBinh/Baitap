#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char code;
	printf("Nhap code: ");
	scanf("%c",&code);
	
	switch(code)
	{
		case'a':
		case'A':
			printf("Tuong ung: Ada");
			break;
		case'b':
		case'B':
			printf("Tuong ung: Basic");
			break;
		case'c':
		case'C':
			printf("Tuong ung: COBOL");
			break;
		case'd':
		case'D':
			printf("Tuong ung: dBASE III");
			break;
		case'f':
		case'F':
			printf("Tuong ung: Fortran");
			break;
		case'p':
		case'P':
			printf("Tuong ung: Pascal");
			break;
		case'v':
		case'V':
			printf("Tuong ung: Visual C++");
			break;
		default:
			printf("Khong khop");
}
	return 0;
}
