#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int name = 0;
    scanf("%d",&name);
    
    if(name ==1) {
        printf("John");
    }else if(name ==2) {
        printf("Tom");
    }else if(name ==3) {
        printf("Paul");
    }else{
        printf("Vacancy");
    }

    return 0;
}