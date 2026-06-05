#include<stdio.h>
int main(){
    int n,sum=0;
    printf("Enter number to checked perfect number:");
    scanf("%d",&n);
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
   if(sum==n){
    printf("%d is perfect Number",n);
   }
   else{
    printf("Not a perfect Number");
   }
 return 0;
}