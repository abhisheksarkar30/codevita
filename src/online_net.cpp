#include<iostream>
int comm[1000001],n;
void mergecom(int,int);
//void print();
int even(int);
int main(){
    int x,y,comNo=1;
    char c;
    cin>>n;
    while(true){
        cin>>c;
        if(c=='C'){
            cin>>x>>y;
            if(comm[x]==0 && comm[y]==0){
                comm[x]=comm[y]=comNo;
                comNo++;
            }
            else if(comm[x]==0){
                comm[x]=comm[y];
            }
            else if(comm[y]==0){
                comm[y]=comm[x];
            }
            else if(comm[x]>comm[y]){
                mergecom(comm[y],comm[x]);
                comNo--;
            }
            else if(comm[y]>comm[x]){
                mergecom(comm[x],comm[y]);
                comNo--;
            }
        }
        else if(c=='Q'){
            cin>>x>>y;
            cout<<even(comNo)<<endl;
        }
        else
            break;
    }

return 0;
}

void mergecom(int x,int y){
    for(int i=0;i<=n;i++){
        if(comm[i]==y)
            comm[i]=x;
        else if(comm[i]>y)
            comm[i]--;
    }
}
int even(int comNo){
int count =0,temp=0;
for(int i=1;i<comNo;i++){
    for(int j=0;j<=n;j++){
        if(comm[j]==i)
            temp++;
    }
    if(temp%2==0 && temp!=0){
        count++;
    }
    temp=0;
}
return count;
}
/*
void print(){
for(int i=0;i<=n;i++)
    cout<<i<<comm[i]<<" ";
cout<<endl;
}*/