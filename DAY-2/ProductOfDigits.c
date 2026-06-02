#include<stdio.h>
int main(){
    int n,p=1,d;
    printf("enter number:");
    scanf("%d",&n);
    while(n!=0){
        d=n%10;
        p=p*d;
        n=n/10;
    }
    printf("the product of digit is %d",p);
    return 0;
}