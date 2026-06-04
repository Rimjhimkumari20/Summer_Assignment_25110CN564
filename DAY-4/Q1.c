#include<stdio.h>
int main(){
    printf("Generate fibonacci series:\n");
    int x=0,y=1,z=0;
    printf("%d\t%d\t",x,y);
    for(int i=2;i<10;i++){      //generate upto 10 term
          z=x+y;
          x=y;
          y=z;
          printf("%d\t",z);
    }
return 0;
}