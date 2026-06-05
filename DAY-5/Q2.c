#include<stdio.h>
int main(){
    int n,fac,sum=0,d;
    printf("Enter number to checked strong Number:");
    scanf("%d",&n);
    int num=n;

    while(num!=0){
        d=num%10;
        fac=1;
      for(int i=1;i<=d;i++){
            fac=fac*i;
      }
    sum=sum+fac;
    num=num/10;
    }

  if(sum==n){
    printf("%d is a Strong Number",n);
  }
  else{
    printf("Not a Strong Number");
  }
  return 0;
}