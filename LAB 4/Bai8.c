#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {

	printf("Kieu int: %d Byte\n",sizeof(int));
	printf("So nguyen: 15\n");
	
	printf("Kieu float: %d Byte\n",sizeof(float));
	printf("So thuc kieu float: 3.456\n");
	
	printf("Kieu double: %d Byte\n",sizeof(double));
	printf("So thuc kieu double: 3.45671234\n");
	
	printf("Kieu char: %d Byte\n",sizeof(char));
	printf("Ky tu: E\n");
	
	printf("Kieu long int: %d Byte\n",sizeof(long int));
	printf("So nguyen kieu long int: 4532134\n");
	
	printf("kieu long double: %d Byte\n",sizeof(long double));
	printf("SO thuc kieu long double: 0.543214654\n");
	
	return 0;
}
