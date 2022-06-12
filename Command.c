#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[])
{
    int ians=0;
    printf("Name of executable is :%s\n",argv[0]);
    printf("Name of Command line Arguments are:%d\n",argc);

    ians=atoi(argv[1])+atoi(argv[2]);
    printf("Addtion is :%d\n",ians);

    return 0;
}