/*program to demonsrate dynamic memory allocation.
  by taking the size of an array during runtime 

  written by : Biswajit Sahoo
  date : 7/02/2021

*/
  

#include<stdio.h>

int main(void){

    char *name ;            //pointer to the name string

    printf("Enter Your Name : ");          
    scanf("%ms",&name);    //dynamic allocation of memory according to the length of the name

    //print the name
    printf("%s\n",name);

    return 0 ;
}