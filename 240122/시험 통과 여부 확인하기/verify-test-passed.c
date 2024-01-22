#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int score;
    scanf("%d", &score);

    if(score >= 80) {
        printf("pass");
    }else {
        printf("%d more score", 80 - score);
    }
    return 0;
}