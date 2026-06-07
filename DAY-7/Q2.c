#include<stdio.h>
int Fib(int n);

int main(){
    int n;
    printf("Enter Fibonacci Term:");
    scanf("%d",&n);
    printf("The Fibonacci Series is: ");
    for(int i=0;i<n;i++){
       printf("%d ",Fib(i));
    }
    return 0;
}

int Fib(int n){
    if(n==0)
     return 0;
    else if (n==1)
    {
        return 1;
    } 
    else
    {
        return Fib(n-1)+Fib(n-2);
    }
}