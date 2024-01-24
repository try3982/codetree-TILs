#include <stdio.h>

int main() {
    int a_age;
    int b_age;
    char a_gen;
    char b_gen;
    scanf("%d %c",&a_age,&a_gen);
    scanf("%d %c",&b_age,&b_gen);


    if((a_age >= 19&& a_gen=='M')|| (b_age >= 19&&b_gen=='M'))
    {
        printf("1");
    }
    else
    {
        printf("0");
    }
    // 여기에 코드를 작성해주세요.
    return 0;
}