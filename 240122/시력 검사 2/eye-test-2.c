#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    float average = 0;
    scanf("%f",&average);
    if(average >=1.0) {
        printf("High");
    }else if(average >0.5){
        printf("Middle");
    }else{
        printf("Low");
    }
    return 0;
}