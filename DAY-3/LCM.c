#include<stdio.h>
int main(){
    int a,b,max;
    printf("Enter first number:");
    scanf("%d",&a);
    printf("Enter second number:");
    scanf("%d",&b);

    max = (a>b) ? a : b;

    while(1)
    {
        if(max%a==0 && max%b==0){
            printf("LCM is : %d",max);
            break;
        }
        max++;
    }

    return 0;
}