#include<stdio.h>
#include<math.h>
int main()
{
int M,T;
double R,A,I,RM;
scanf("%d",&M);
scanf("%d",&T);
scanf("%lf",&R);
RM=M;
T--;
while(T>0)
{
A=RM/(1+R/(double)1200);
I=RM-A;
RM+=M-I;
T--;
}

A=RM/(1+R/(double)1200);
I=RM-A;
RM-=I;
printf("%.f",RM);
return 0;
}
