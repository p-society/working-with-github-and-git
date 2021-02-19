#include<stdio.h>
#include<stdlib.h>
#include<math.h>
//program to create two-dimensional matrix representing Pascal's triangle
int triangle();
int main()
{
    int row;
    int i, j;

    printf("Enter the number of rows in Pascal's triangle: ");
    scanf("%d", &row);

    for(i=0; i<row; i++)
    {
        for(j=0; j<=(row - i - 2); j++)
        {
            printf("   ");
        }
        for(j=0; j<=i; j++)
        {
            printf("%d", triangle(i)/(triangle(j)*triangle(i-j)));
            printf("     ");
        }
        printf("\n");
    }

    return 0;
}

int triangle(int n)
{
    int x;
    int res = 1;

    for(x=1; x<=n; x++)
    {
        res = res * x;
    }

    return res;
}
