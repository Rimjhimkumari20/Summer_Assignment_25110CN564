#include<stdio.h>
int main(){
    int n,i,fac=1;
    printf("Enter number for factorial:");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        fac=fac*i;
    }
    printf("factorial of a given number is %d",fac);
    return 0;
}