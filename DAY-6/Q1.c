#include<stdio.h>
int main(){
    int n,i=0,binary[20];
    printf("Enter Decimal Number:");
    scanf("%d",&n);
    while(n!=0)
    {
        binary[i]=n%2;
        n=n/2;
        i++;
    }
   
    printf("Binary Form Of The Number is:");
    
    for(int j=i-1;j>=0;j--)
    {
        printf("%d",binary[j]);
    }

    return 0;
}