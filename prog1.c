#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char a[1000];
    int i;

 scanf("%[^\n]s",a);
 int n=strlen(a);
for(i=0;i<n;i++)
{
    
if(a[i]==' ')
printf("\n");
else
printf("%c",a[i]); 
}
 return 0;
    
}
