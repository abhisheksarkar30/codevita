n=input("");
def concatenate(n):
    c=0;
    list=[];
    a=[];
    arr=[];
    store=[];
    k=0;
    last=0;
    for i in range(2,n+1):
        c=0;
        for j in range(1,i+1):
            if i%j==0:
                c=c+1;
        if c==2:
            list.append(i);
            store.append(i);
            last=i;
    for i in range(n+1,int(str(last)+str(last))):
        c=0;
        for j in range(1,i+1):
            if i%j==0:
                c=c+1;
        if c==2:
            list.append(i);
    for i in store:
        for j in store:
            if int(str(i)+str(j))in list:
                if int(str(i)+str(j)) not in a:
                    a.append(int(str(i)+str(j)))
    print len(a)


concatenate(n);
