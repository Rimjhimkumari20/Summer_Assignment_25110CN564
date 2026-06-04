#include<stdio.h>
#include<math.h>
int main(){
    int n,c=0,num,r,sum=0;
    printf("Enter number:");
    scanf("%d",&n);
    num=n;
    while(num!=0){
        num=num/10;
        c++;
    }
    num=n;
    while(num!=0){
        r=num%10;
        sum=sum+pow(r,c);
        num=num/10;
    }

    if(sum==n){
        printf("%d is an Armstrong number",n);
    } else{
        printf("NOT an Armstrong Number");
    }
  return 0;
}