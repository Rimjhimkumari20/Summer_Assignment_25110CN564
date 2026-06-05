#include<stdio.h>
int main(){
    int n,c,largest=0;
    printf("Enter Number:");
    scanf("%d",&n);
    for(int i=2;i<=n;i++){
        if(n%i==0){
            c=0;
          for(int j=1;j<=i;j++){
            if(i%j==0){
                c++;
            }
        }

         if(c==2) {
             largest=i;
         }

        }

    }
    printf("Largest prime Factor is: %d",largest);
    return 0;

}