#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x[3][3],y[3][3];
	int (*pt1)[3],(*pt2)[3];
	int i,j;
	
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			printf("\n x[%d][%d] y[%d][%d]: ",i,j,i,j);
			scanf("%d %d",pt1,pt2);
		}

	return 0;
}
