#include<stdio.h>
int Sum(int n);

int main(){
    int n;
    printf("Enter Number:");
    scanf("%d",&n);
    printf("Sum Of Digits= %d",Sum(n));
    return 0;
}


int Sum(int n){
    if(n==0){
        return 0;
    }
    else {
        return (n%10) + Sum(n/10);
    }
}