#include<stdio.h>
int main(){
    int n,c=0;
    printf("Enter number to be checked:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        if(n%i==0){
            c++;
        }
    }
   if(c==2){
    printf("%d is prime number",n);
   }
   else{
    printf("not a prime number");
   }
return 0;
}