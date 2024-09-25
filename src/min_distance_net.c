#include<stdio.h>
#include<math.h>
int main()
{
    double x,y,c1=0,c2=0,va,vb;
    scanf("%lf%lf",&x,&y);
    scanf("%lf%lf",&va,&vb);
    if(x>0 && y>0 && va>0 && vb>0)
    {
        c2=sqrt((x*x)+(y*y));
        do
        {
in:
            x=x-va;
            y=y-vb;
            c1=sqrt((x*x)+(y*y));
            if(c1<=c2)
            {
                c2=c1;
                goto in;
            }
            else
                break;
        }
        while(c1>=c2);
        if(c2==0)
            printf("0.0");
        else
            printf("%0.11f",c2);
    }
    else
        printf("Invalid Input");
    return 0;
}
