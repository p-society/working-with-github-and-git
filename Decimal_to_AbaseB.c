#include <stdio.h>
#define MAX 100
void itob(int n,char s[MAX],int b)
{
    //printf("\nEntered Function\n");
    int digit,i=0,j=0;
    char digit_ch,temp;
    while ( n )
    {
        digit = n%b;
        
        if (b ==16){ 
        switch (digit)                                                      // This is for hexadecimal only
        {
            case 10: digit_ch = 'A';break;
            case 11: digit_ch = 'B';break;
            case 12: digit_ch = 'C';break;
            case 13: digit_ch = 'D';break;
            case 14: digit_ch = 'E';break;
            case 15: digit_ch = 'F';break;
            default: digit_ch = '0' + digit;break; 
        }
        }
        else
        {
            digit_ch = '0' + digit;
        }
        s[i] = digit_ch;
        ++i;
        n=n/b;
    }
    //printf("\nWhile loop done\n");
    s[i] = '\0';
    

    for (i=i-1,j=0;j<i;++j,--i)
    {
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    printf("\nNumber in base %d from is: %s\n",b,s);

}

int main()
{
    int n,b;
    char s[MAX];
    printf("Enter number in decimal form: ");
    scanf("%d",&n);
    printf("\nEnter base: (Works only for 16 if >=10) ");
    scanf("%d",&b);
    itob(n,s,b);

}