#include<stdio.h>
int main(){
    int n,rev=0,d;
    printf("Enter number to reverse:");
    scanf("%d",&n);
    while(n!=0){
        d=n%10;
        rev=rev*10+d;
        n=n/10;
    }
    printf("reverse of a given number is %d",n);
    return 0;
}