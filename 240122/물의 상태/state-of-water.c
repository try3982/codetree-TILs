#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int ondo =0;
    scanf("%d", &ondo);
    if(ondo < 0){
        printf("ice");
    }else if(ondo > 100) {
        printf("vapor");
    }else {
        printf("water");
    }
    return 0;
}