#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float com=0,sales_amt;
	char grade;
	printf("Enter sales amount: ");
	scanf("%f",&sales_amt);
		fflush(stdin);
	printf("\nEnter the grade: ");
	scanf("%c",&grade);

	if(sales_amt>1000)
		if(grade =='A')
			com = sales_amt * 0.1;
		else
			com = sales_amt * 0.08;
	else
		com = sales_amt * 0.05;
	
	printf("\nCommission = %f",com);
	return 0;
}
