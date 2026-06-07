#include<stdio.h>
int fac(int n);

int main(){
    int n,Fac;
    printf("Enter Number:");
    scanf("%d",&n);
    Fac = fac(n);
    printf("Factorial Of Given Number is:%d",Fac);
    return 0;
}

int fac(int n){
    for(int i=1;i<=n;i++){
    if(n==0 || n==1){
        return 1;
    }
    else{
        return n*fac(n-1);
    }
  }
}