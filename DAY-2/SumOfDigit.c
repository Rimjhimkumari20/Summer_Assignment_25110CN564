#include<stdio.h>
int main(){
    int n,sum=0,d;
    printf("enter number to be sum:");
    scanf("%d",&n);
    while(n!=0){
        d=n%10;
        sum=sum+d;
        n=n/10;
    }
    printf("sum of digit of a number:%d",sum);
    return 0;
}