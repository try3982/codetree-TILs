#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int cnt =0;
    int n=0;
    for(int i=1; i <=10; i++) {
        scanf("%d", &n);
        if(i % 2 != 0) {
            cnt++;
        }
    }
    printf("%d",cnt);
    return 0;
}