#include<stdio.h>
int main(){
    int n,i,Table=1;
    printf("Enter the number:");
    scanf("%d",&n);
    for(i=1;i<=10;i++){
        Table=n*i;
        printf("Multiplication table of %d * %d=%d\n",n,i,Table);
    }
    return 0;
}
