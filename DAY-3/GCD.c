#include<stdio.h>
int main(){
    int a,b;
    printf("Enter first number:");
    scanf("%d",&a);
    printf("Enter second number:");
    scanf("%d",&b);
    while(b%a!=0){
        int R = b%a;
        b=a;
        a=R;
    }
    printf("GCD of two number is: %d",a);
    return 0;
}