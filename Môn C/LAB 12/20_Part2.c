#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct ttsv
{
	int masv;
	char tensv[30];
	char khoahoc[10];
	int namdk;
};

void main(){
	struct ttsv sv[10];
	int i;
	void thongtin(struct ttsv SV[10]);
	void tt(struct ttsv SV1[10]);
	for(i=0;i<10;i++)
	{
		printf("\nNhap ma sv thu %d: ",i+1);
		scanf("%d",&sv[i].masv);
		printf("Nhap ten sv thu %d: ",i+1);
		scanf("%s",sv[i].tensv);
		printf("Nhap khoa hoc sv thu %d: ",i+1);
		scanf("%s",sv[i].khoahoc);
		printf("Nhap nam dk sv thu %d: ",i+1);
		scanf("%d",&sv[i].namdk);
	}
	thongtin(sv);
	tt(sv);
}
void thongtin(struct ttsv SV[10]){
	int i,j,n=0;
	char flag;
	flag = 'y';
	printf("\nNhap nam dk de tim thong tin sv: ");
	scanf("%d",&j);
	if(flag=='y')
	{
	for(i=0;i<10;i++)
		if(SV[i].namdk==j)
		{ 	
			n++;
			printf("\nNhung sinh vien nhap hoc nam %d la:",j);
			printf("\n\nMa SV: %d\nTen SV: %s\nKhoa hoc: %s",SV[i].masv,SV[i].tensv,SV[i].khoahoc);
		}
	if(n==0)
		printf("\nKhong co sv nao nhap hoc nam %d",j);
	printf("\n Tiep tuc tim kiem (y/n)");
	fflush(stdin);
	scanf("%c",&flag);
	}
}
void tt(struct ttsv SV1[10]){
	int i,j,n=0;
	char flag = 'y';
	printf("\nNhap ma svv de tim thong tin s: ");
	scanf("%d",&j);
	if(flag=='y')
	{
		for(i=0;i<10;i++)
			if(SV1[i].masv==j)
			{
				n++;
				printf("\nSinh vien %d co thong tin la: ",j);
				printf("\n\nTen SV: \nKhoa hoc: %s\nNam dk: %d",SV1[i].tensv,SV1[i].khoahoc,SV1[i].namdk);
			}
		if(n==0)
			printf("\nKhong co sinh vien ma %d",j);
		printf("\nTiep tuc tim kiem (y/n):");
		fflush(stdin);
		scanf("%c",&flag);
	}
}
