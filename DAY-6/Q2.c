#include<stdio.h>
#include<math.h>
int main(){
    int n,r,c=0,sum=0;
    printf("Enter Binary Number:");
    scanf("%d",&n);
    while(n!=0){
        r=n%10;
        sum=sum+r*pow(2,c);
        n=n/10;
        c++;
    }
    
    printf("Decimal Form Of The Number is %d",sum);
    return 0;
}