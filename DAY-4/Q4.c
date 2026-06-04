#include<stdio.h>
#include<math.h>
int main(){
    int n,c,num,r,sum;
    printf("Armstrong number in range(1-1000):\n");
    for(n=1;n<=1000;n++){
        num=n;
        c=0;
        sum=0;
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
        printf("%d\t",n);
     }
  }
  return 0;
}