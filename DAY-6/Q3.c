#include<stdio.h>
int main(){
    int n,i=0,binary[20],c=0;
    printf("Enter Number:");
    scanf("%d",&n);
    while(n!=0)
    {
        binary[i]=n%2;
        n=n/2;
        i++;
    }

     for(int j=i-1;j>=0;j--)
    {
        printf("%d",binary[j]);
        if(binary[j]==1){
            c++;
        }
    }
    
    printf("\n Set Bits In A Number is: %d",c);
    return 0;
}