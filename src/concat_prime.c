#include<stdio.h>

int isprime(int n)
{
	int k,i;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
			return 0;
	}
	return 1;
}

int main(){
	int r,i,k,a[20],store[80],c=0,j,temp1,temp2,counter=0,f=1;
	scanf("%d",&r);
	for(i=2;i<=r;i++){
		if(isprime(i)==1)
			a[c++]=i;
	}
	for(i=0;i<c;i++)
	{
		for(j=i;j<c;j++){
			if(a[i]/10==0 && a[j]/10==0)
			{
				temp1=a[i]*10+a[j];
				temp2=a[j]*10+a[i];
			}
			else if(a[i]/10==0 && a[j]/10!=0){
				temp1=a[i]*100+a[j];
				temp2=a[j]*10+a[i];
			}
			else if(a[i]/10!=0 && a[j]/10==0){
				temp1=a[i]*10+a[j];
				temp2=a[j]*100+a[i];
			}
			else
			{
				temp1=a[i]*100+a[j];
				temp2=a[j]*100+a[i];
			}
			f=1;
			if(isprime(temp1)==1)
			{
			    for(k=0;k<counter;k++)
                if(store[k]==temp1)
					{
					    f=0;
						break;
					}
				if(f==1)
				store[counter++]=temp1;
			}
			f=1;
			if(isprime(temp2)==1)
			{
			    for(k=0;k<counter;k++)
                if(store[k]==temp2)
					{
					    f=0;
						break;
					}
				if(f==1)
				store[counter++]=temp2;
			}
		}
	}
	printf("%d",counter);
}

