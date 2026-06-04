#include<stdio.h>
int main(){
    int n;
    printf("Enter nth term:");
    scanf("%d",&n);
    int x=0,y=1,z=0;
    printf("%d\t%d\t",x,y);
    for(int i=2;i<n;i++){
        z=x+y;
        x=y;
        y=z;
        printf("%d\t",z);
    }
 return 0;
}