#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int y=0;
    scanf("%d" ,&y);

    if(y % 4 == 0) {
        if(y % 100 == 0) {
            if(y % 400 == 0) {
                printf("true");
            }else {
                printf("false");
            }
        }
        else {
            printf("true");
        }
    }else {
        printf("false");
    }
    return 0;
}