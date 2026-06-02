#include<stdio.h>
int main() {
    int n,i,sum=0;
    printf("enter the number:");
    scanf("%d",&n);
    for(i =0;i<=n;i++) 
    {
        sum=sum+i;
    }
    printf("ths sum of N natural number is %d",sum);
    return 0;
}