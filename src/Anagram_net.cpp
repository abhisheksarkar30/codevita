 #include <sstream>
 #include <iostream>
 #include<cstdio>
 #include<cstdlib>
 #include <cstring>
 #include <string>
 #include<algorithm>
 using namespace std;
 int main ()
 {
 std::string str;
 string str1,str2,str3;
 std::getline(cin, str);
std::transform(str.begin(), str.end(), str.begin(), ::tolower);
str1=str;
string arr[5010],arr1[5010];
int l=0,i,l1=0,j,flag=0,mp=0,mp1=0;

 char * cstr = new char [str.length()+1];
 std::strcpy (cstr, str.c_str());
 // cstr now contains a c-string copy of str

 char * p = std::strtok (cstr,".,;!? ");
 while (p!=0)
 {
//std::cout << p << '\n';
arr[l++]=p;
p = strtok(NULL,".,;!? ");
}
delete[] cstr;
 char * cstr1 = new char [str1.length()+1];
 std::strcpy (cstr1, str.c_str());

 // cstr now contains a c-string copy of str

 char * p1= std::strtok (cstr1,".,;!? ");
 while (p1!=0)
 {
//std::cout << p << '\n';
arr1[l1++]=p1;
p1 = strtok(NULL,".,;!? ");
}
  delete[] cstr1;
 //std::sort(arr, arr + l);
 for(i=0;i<l-1;i++)
 {
  for(j=i+1;j<l;j++)
  {
      if(arr1[j]!="0" && arr1[i]!="0" &&arr1[i]==arr1[j])
      arr1[j]="0";
  }
  }
   for(i=0;i<l;i++)
   {
  str2=arr1[i];
  std::sort(str2.begin(), str2.end());
  arr1[i]=str2;
    }
    /*for(i = 0; i <l; i++)
    {
    cout << arr[i]<<" "<<arr1[i]<< endl;
     }*/
  //cout<<l;
    for(i=0;i<l-1;i++)
   {
 str3="";
 if(mp1>0)
  str3.append("\n");
  flag=0;
   mp=0;
  if(arr1[i]!="0")
  {
     for(j=i+1;j<l;j++)
  {
     if(arr1[j]!="0" && (arr1[i]==arr1[j]) && flag==0)
    {
    str3.append(arr[i]);
    str3.append(" ");
    str3.append(arr[j]);
    str3.append(" ");
   // cout<<arr[i]<<" "<<arr[j]<<" ";
    arr1[j]="0";
    flag=1;
    mp=1;
   mp1++;
   }
   else if((arr1[i]==arr1[j]) && flag==1)
   {
    arr1[j]="0";
    //cout<<arr[j]<<" ";

    str3.append(arr[j]);
    str3.append(" ");

    mp=1;
   }
 }
 if(str3!=""&& str3!="\n"&&mp1>0)
 cout<<str3;
 }
 }
 //cout<<"\n";
 return 0;
  }