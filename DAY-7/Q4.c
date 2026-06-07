#include<stdio.h>

int Reverse(int n);

int main(){
    int n;
    printf("Enter Number:");
    scanf("%d",&n);
    printf("Reverse Of The Given Number is: %d",Reverse(n));
    return 0;
}

int rev = 0;
int Reverse(int n){
    if(n==0){
        return rev;
    }
    else{
        rev = rev*10+(n%10);
        return Reverse(n/10);
    }
}
