#include<stdio.h>
int main(){
    int n,i,c=0,d;
    printf("enter number to count:");
    scanf("%d",&n);
    while(n!=0){
        d=n%10;
        c++;
        n=n/10;
    }
    printf("count digit in a number is %d",c);
    return 0;
}